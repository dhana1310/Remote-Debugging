package com.asyouwish.remote_debugging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class RemoteDebuggingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RemoteDebuggingApplication.class, args);
	}

	@GetMapping("/")
	public String getMethod() {
		return "request Received";  // Add Debugger here

	}

}
