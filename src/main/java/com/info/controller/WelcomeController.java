package com.info.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.info.service.WelcomeService;

@RestController
public class WelcomeController {
	@Autowired
	private WelcomeService service;
	@GetMapping("/welcome")
	public ResponseEntity<String> getMessage(){
		String resMessage = service.getMessage();
		return new ResponseEntity<>(resMessage,HttpStatus.OK);
		
	}

}
