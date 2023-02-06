package com.demo.springbootemail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringbootEmailApplication {

	@Autowired
	private EmailSenderService senderService;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmailApplication.class, args);
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendMail() {
		senderService.sendEmail("carnage.14k@gmail.com", "TEST EMAIL SUBJECT", "TEST EMAIL BODY");
	}
}