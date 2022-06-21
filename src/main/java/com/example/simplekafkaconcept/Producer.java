package com.example.simplekafkaconcept;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    public Producer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @EventListener(ApplicationStartedEvent.class)
    public void generate(){
        for(int i=1; i<=10; i++){
            //publish data to testTopic
            kafkaTemplate.send("testTopic", "Value is "+i);
        }
        
    }
    
}