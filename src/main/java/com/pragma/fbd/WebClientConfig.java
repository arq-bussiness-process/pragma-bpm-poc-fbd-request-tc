package com.pragma.fbd;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebClientConfig
{

	@Bean(name = "MDSRestTemplate")
	public RestTemplate getNextDayRestTemplate() throws IOException
	{
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.getMessageConverters().add(0, new StringHttpMessageConverter(StandardCharsets.UTF_8));
		
		System.out.println("Restemplate INICIALIZADO");
		return restTemplate;
	}

}
