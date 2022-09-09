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
public class GenerarVirtualCard implements JavaDelegate{
	
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		//Simula la generacion de tarjeta virtual y activacion inmediata
		execution.setVariable("statusRealce", "started");
		execution.setVariable("tarjetaVirtual", "**** **** ***1 2345");
		execution.setVariable("montoAprobado", "3'000.000");
	}
}
