package pl.devset.scse.events;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;

import java.time.LocalDateTime;

@Service
public class MQService {


    @Autowired
    private StreamBridge streamBridge;


    @Scheduled(fixedDelay =1000 )
    void send(){
        Message<String> message = MessageBuilder.withPayload("Hello, RabbitMQ from DEVSET! " + LocalDateTime.now()).build();
        streamBridge.send("events-stream-producer", message);
    }
}
