package com.example.simplekafkaconcept;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@SpringBootApplication
public class SimpleKafkaConceptApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleKafkaConceptApplication.class, args);
	}

	//new Topic creation
	@Bean
	NewTopic hobbit2() {
	  return TopicBuilder.name("secondTopic").partitions(12).replicas(3).build();
	}

}
