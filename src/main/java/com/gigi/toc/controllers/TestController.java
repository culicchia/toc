package com.gigi.toc.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path="/")
	public ResponseEntity<String> test(){
		return ResponseEntity.ok("Hello Gigi");
	}
}
