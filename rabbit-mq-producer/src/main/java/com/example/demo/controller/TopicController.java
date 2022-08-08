package com.example.demo.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Student;
import com.example.demo.direct.config.TopicExchangeConfig;

@RestController
public class TopicController {
	
	@Autowired
	@Qualifier("second")
	private RabbitTemplate template;
	;
	@PostMapping(path="/topic/students")
	public String addStudent(@RequestBody Student entity) {
		String routekey="award.ece.2022";
		if(entity.getId()>200) {
			routekey="award.cse.2022";
		}
		template.convertAndSend(TopicExchangeConfig.EXCHANGE_NAME,routekey,entity);
		
		return "One Student Details Sent";
	}

}


