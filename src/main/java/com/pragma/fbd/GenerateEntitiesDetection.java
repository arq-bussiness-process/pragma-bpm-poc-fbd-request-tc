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

@Service
public class GenerateEntitiesDetection implements JavaDelegate{
	
	@Autowired
	@Qualifier("MDSRestTemplate")
	RestTemplate MDSrestTemplate;
	
	 @Autowired
	 RuntimeService runtimeService;
	 
	 //Url consumo cuenta pragma, descomente si se usa dicha cuenta y comente linea siguiente
	 String urlBackend = "https://rhwtwpdd05.execute-api.us-east-1.amazonaws.com/dev/customers/documnents/validations/jobs";
	 //Url consumo cuenta victor, descomente si se usa dicha cuenta y comente linea anterior
	 //String urlBackend = "https://maky83428e.execute-api.us-east-1.amazonaws.com/dev/customers/documnents/validations/jobs";
	 
	 String urlLoadFile = "";
			 
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		
		//Se obitenen parametros requeridos para la tarea
		FileValue fileVariable = execution.getVariableTyped("documentLoad");
		String fileName = fileVariable.getFilename();
		
		//Se genera cabeceras
		HttpHeaders headers = new HttpHeaders();
		headers.add("X-RqUID", UUID.randomUUID().toString());
		headers.add("X-TerminalId", "BPM-001");
		headers.add("X-ClientDt", "2022-07-21");
		headers.add("x-api-key", "W2t3xWRYLC9TiPwBFe5S4aqRxC7whKNJ47igXVfj");
		headers.add("Content-Type","application/json;charset=UTF-8");
		headers.add("accept","application/json");

		CreateJobRq body = new CreateJobRq();
		body.setFileName(fileName);
		
		HttpEntity<CreateJobRq> requestCreate = new HttpEntity<CreateJobRq>(body, headers);
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(urlBackend);
		
		ResponseEntity<CreateJobRs> responseBackend = MDSrestTemplate.exchange(builder.toUriString(), HttpMethod.POST, requestCreate, CreateJobRs.class);
		
		execution.setVariable("JobId", responseBackend.getBody().getJobId());
		
		
		/*
		
		//1. Se construye url para obtener del s3 la url prefirmada
		UriComponentsBuilder builderUrl = UriComponentsBuilder.fromHttpUrl(urlBackend).queryParam("file_key", fileName);
		
		System.out.print("URL: "+ builderUrl.toString());
		System.out.print("URL: "+ builderUrl.toUriString());
		

		//Se arma request
		HttpEntity<String> requestBackend = new HttpEntity<String>(headers);
				
		//Se consume servicio.
		ResponseEntity<PresignalUrlFileRs> responseBackend = MDSrestTemplate.exchange(builderUrl.toUriString(), HttpMethod.GET, requestBackend, PresignalUrlFileRs.class);
		
		//Se obtiene url para carga de archivo
		urlLoadFile = responseBackend.getBody().getPresignalUrl();
		URI uri = URI.create(urlLoadFile);

		
		//Se arma request con archivo
		byte[] file = fileVariable.getValue().readAllBytes();
		String encoded = Base64.getEncoder().encodeToString(file);
		
		headers.add("Content-Type","application/pdf");
		 
		HttpEntity<byte[]> requestFileLoad = new HttpEntity<byte[]>(file, headers);
		ResponseEntity<String> responseStatus = MDSrestTemplate.exchange(uri, HttpMethod.PUT, requestFileLoad, String.class);

		String statusCode = responseStatus.getStatusCode().toString();*/
	}
}
