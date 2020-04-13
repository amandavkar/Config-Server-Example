package com.atul.main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class Example {
	
	@Value("${app.message}")
	private String message;
	
	@Value("${my.message}")
	private String msg;
	
	@Value("${db.connection}")
	String connection;
	
	@RequestMapping("/show")
	public String showmessage() {
		return message+" "+msg+" "+connection;
		
	}

}
