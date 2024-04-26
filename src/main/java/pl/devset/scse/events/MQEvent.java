package pl.devset.scse.events;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.function.Consumer;

@Configuration
public class MQEvent {

    @Bean
    public Consumer<String>  consumeEvent() {
        return message -> System.out.println("Received: " + message);
    }


}
