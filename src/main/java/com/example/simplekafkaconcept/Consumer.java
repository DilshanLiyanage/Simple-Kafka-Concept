package com.example.simplekafkaconcept;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    

    //consume data by listening to testTopic
    @KafkaListener(topics = {"testTopic"}, groupId = "simple-kafka-concept")
    public void consume(String data){
        System.out.println("Received Data - "+data);
    }
    
}
