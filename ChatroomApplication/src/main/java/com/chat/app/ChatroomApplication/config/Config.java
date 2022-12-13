package com.chat.app.ChatroomApplication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker

public class Config implements WebSocketMessageBrokerConfigurer {
	
	public void registerStompEndpoints(StompEndpointRegistry registry) {
		registry.addEndpoint("/server1").withSockJS();
		//user needs  server1 to connect to server
	}
	
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.enableSimpleBroker("/topic");
        registry.setApplicationDestinationPrefixes("/app");
        //user needs to subscribe to /topic to receive message. Broker gets enable
        //user needs to use app/Message url to send message.
		
	}
	
	

}
