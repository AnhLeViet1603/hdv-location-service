package com.mywebsite.locationservice.config;

import com.mywebsite.locationservice.model.event.DriverAcceptedEvent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.listener.DefaultErrorHandler;

@Configuration
public class KafkaConfig {

    @Bean
    public ConcurrentKafkaListenerContainerFactory<String, DriverAcceptedEvent> kafkaListenerContainerFactory(
            ConsumerFactory<String, DriverAcceptedEvent> consumerFactory) {

        ConcurrentKafkaListenerContainerFactory<String, DriverAcceptedEvent> factory =
                new ConcurrentKafkaListenerContainerFactory<>();

        factory.setConsumerFactory(consumerFactory);
        factory.setCommonErrorHandler(new DefaultErrorHandler());

        return factory;
    }
}