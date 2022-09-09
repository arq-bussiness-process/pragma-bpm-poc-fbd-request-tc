package com.pragma.fbd;


import java.util.UUID;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.ObjectValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.pragma.fbd.dto.CentralesRiesgoRs;

@Service
public class SimpleRestClientDelegate implements JavaDelegate{
	
	@Autowired
	@Qualifier("MDSRestTemplate")
	RestTemplate MDSrestTemplate;
	
	 @Autowired
	 RuntimeService runtimeService;
	 
	 //Url backend
	 String urlBackend = "https://pragmafbdautomation.free.beeceptor.com/my/api/centrales/usuarios/:documentType/:documentId/riesgos";
			 
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		//Consulta centrales de Riesgo para eso se obtienen variables requeridas en la consulta
		String documentType = execution.getVariableTyped("documentType").getValue().toString();
		String documentId = execution.getVariableTyped("documentId").getValue().toString();
		
		urlBackend = urlBackend.replace(":documentType", documentType);
		urlBackend = urlBackend.replace(":documentId", documentId);
		
		//Se genera cabeceras
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-RqUID", UUID.randomUUID().toString());
		headers.add("X-TerminalId", "BPM-001");
		headers.add("X-ClientDt", "2022-07-21");
		headers.add("x-api-key", "W2t3xWRYLC9TiPwBFe5S4aqRxC7whKNJ47igXVfj");
		headers.add("Content-Type","application/json;charset=UTF-8");
		headers.add("accept","application/json");

		//Se arma request
		HttpEntity<String> requestBackend = new HttpEntity<String>(headers);
				
		//Se consume servicio.
		ResponseEntity<CentralesRiesgoRs> responseBackend = MDSrestTemplate.exchange(urlBackend, HttpMethod.GET, requestBackend, CentralesRiesgoRs.class);
		
		//Almacena respuesta en variable dentro del flujo para su respectiva validación (opcion 1)
		execution.setVariable("statusReport", responseBackend.getBody().getStatusReport());
		
		//Almacena respuesta en variable dentro del flujo para su respectiva validación (opcion 2)
		//ObjectMapper obj = new ObjectMapper();
	    //String jsonRs = obj.writeValueAsString(responseBackend.getBody());
	    ObjectValue objResponseBackend = Variables.objectValue(responseBackend.getBody()).serializationDataFormat("application/json").create(); //application json lets you all class function...
	    execution.setVariable("responseBackendCentrales", objResponseBackend);
	}
}
