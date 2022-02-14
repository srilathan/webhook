package com.webhook.webhook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/webhook")
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}
//http://07d1-165-225-122-247.ngrok.io
	@PostMapping///api/webhook
	public ResponseEntity<String> print(@RequestBody String requestBody) {
		
		return new ResponseEntity<String>(requestBody, HttpStatus.OK);
	}

}