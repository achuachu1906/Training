package com.example.demo;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.example.demo.direct.config.DirectExchangeConfig;

@Component
public class Consumer {
	
	@RabbitListener(queues = DirectExchangeConfig.ROUTING_KEY)
	public void consumeMessage(String msg) {
		System.out.println("Message received from queue : " +msg);
	}

}
