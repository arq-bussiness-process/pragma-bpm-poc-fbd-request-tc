package com.pragma.fbd;


import java.net.URI;
import java.util.Base64;
import java.util.Map;
import java.util.UUID;
import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.camunda.bpm.engine.variable.Variables;
import org.camunda.bpm.engine.variable.value.FileValue;
import org.camunda.bpm.engine.variable.value.ObjectValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.pragma.fbd.dto.CentralesRiesgoRs;
import com.pragma.fbd.dto.PresignalUrlFileRs;

import io.swagger.model.CreateJobRq;
import io.swagger.model.CreateJobRs;
import io.swagger.model.ProcessJobRs;
import io.swagger.model.QueryJobRs;

@Service
public class EntitiesDetectionResult implements JavaDelegate{
	
	@Autowired
	@Qualifier("MDSRestTemplate")
	RestTemplate MDSrestTemplate;
	
	 @Autowired
	 RuntimeService runtimeService;
	 
	 //Url consumo cuenta pragma, descomente si se usa dicha cuenta y comente linea siguiente
	 String urlBackend = "https://rhwtwpdd05.execute-api.us-east-1.amazonaws.com/dev/customers/documnents/validations/jobs/process";
	 //Url consumo cuenta victor, descomente si se usa dicha cuenta y comente linea anterior
	 //String urlBackend = "https://maky83428e.execute-api.us-east-1.amazonaws.com/dev/customers/documnents/validations/jobs/process";
	 String urlLoadFile = "";
			 
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		//Se obitenen parametros requeridos para la tarea
		String fileName= execution.getVariableTyped("FileName").getValue().toString();
		String JobId= execution.getVariableTyped("JobId").getValue().toString();
		String JobIdStatus= execution.getVariableTyped("JobIdStatus").getValue().toString();
		
		System.out.println("Job: " + JobId);
		System.out.println("estado: " + JobId);
		//Se genera cabeceras
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-RqUID", UUID.randomUUID().toString());
		headers.add("X-TerminalId", "BPM-001");
		headers.add("X-ClientDt", "2022-07-21");
		headers.add("x-api-key", "W2t3xWRYLC9TiPwBFe5S4aqRxC7whKNJ47igXVfj");
		headers.add("Content-Type","application/json;charset=UTF-8");
		headers.add("accept","application/json");

		//construye url
		UriComponentsBuilder builderUrl = UriComponentsBuilder.fromHttpUrl(urlBackend).queryParam("JobId", JobId).queryParam("FileName", fileName);

		//Se arma request
		HttpEntity<String> requestBackend = new HttpEntity<String>(headers);
		
		//Se consume servicio.
		ResponseEntity<ProcessJobRs> responseBackend = MDSrestTemplate.exchange(builderUrl.toUriString(), HttpMethod.GET, requestBackend, ProcessJobRs.class);
			
		ObjectValue objResponseBackend = Variables.objectValue(responseBackend.getBody()).serializationDataFormat("application/json").create(); //application json lets you all class function...
		execution.setVariable("responseEntities", objResponseBackend);
	}
}
