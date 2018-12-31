package com.ankita.main.client;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public String restService(String url, String requestBody) {
	
		RestTemplate restTemplate = new RestTemplate();
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		logger.info("Request Received"+requestBody);
		
		HttpEntity<String> entity = new HttpEntity<>(requestBody,headers);
		logger.info(url);
		
		ResponseEntity<String> response = restTemplate.postForEntity(url, entity, String.class);
		String res  = response.getBody();
		logger.info("Response Received");
		return res;	
	}
}


