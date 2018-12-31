package com.ankita.main.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ankita.main.client.RestClient;
import com.ankita.main.dto.RestAPIRequestDTO;
import com.ankita.main.dto.RestAPIResponseDTO;
import com.ankita.main.util.PropertyUtil;

@RequestMapping("/api")
@RestController
public class RestAPIController {
	
	@Autowired
	RestClient restClient;
	
	@Autowired
	PropertyUtil propertyUtil;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@RequestMapping("/users")
	public RestAPIResponseDTO createUser(RestAPIRequestDTO restAPIRequestDTO) {
		logger.info("create user called");
		StringBuffer sb = new StringBuffer();
		sb.append(restAPIRequestDTO.getName());
		sb.append(restAPIRequestDTO.getJob());
		restClient.restService(propertyUtil.getGetCreateUserURL(), sb.toString());
		
		return null;

	}

	public List<RestAPIResponseDTO> getUsers() {
		return null;

	}
}
