package com.npickard.mytestapplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRESTController {

	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

}
