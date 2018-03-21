package com.example.bravo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class BravoServiceApplication {

	private final Logger log = LoggerFactory.getLogger(getClass());
	
	public static void main(String[] args) {
		SpringApplication.run(BravoServiceApplication.class, args);
	}
	
	@GetMapping("time")
	public ResponseEntity<?> time()
	{
		log.info("Someone asked me for time...");
		return ResponseEntity.ok(System.currentTimeMillis());
	}
	
	@GetMapping("date")
	public ResponseEntity<?> date()
	{
		log.info("Someone asked me for time...");
		return ResponseEntity.ok(new Date());
	}
}
