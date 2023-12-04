package com.practice.project2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class RestService {

	private static Logger LOG = LoggerFactory
			.getLogger(RestService.class);

	public static void main(String[] args) throws InterruptedException {
		LOG.info("EXECUTING : command line runner");

		ConfigurableApplicationContext context = SpringApplication.run(RestService.class, args);

		MessageProducer producer = context.getBean(MessageProducer.class);
		producer.sendMessage("Hello, ReadWrite Service!");

		MessageListener listener = context.getBean(MessageListener.class);
		listener.latch.await(10, TimeUnit.SECONDS);
	}


}
