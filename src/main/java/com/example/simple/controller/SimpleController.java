package com.example.simple.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path="/api/simple")
public class SimpleController {
	
	@CrossOrigin
	@RequestMapping(value="/hello-world",
			method=RequestMethod.GET)
	public ResponseEntity<String> getHelloWorld(){
		HttpHeaders headers = new HttpHeaders();
        System.out.println("Return Hello World!");
		return new ResponseEntity<>("Hello World - Simple Controller Response!", headers, HttpStatus.OK);
    }
}
