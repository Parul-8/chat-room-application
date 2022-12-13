package com.chat.app.ChatroomApplication.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.chat.app.ChatroomApplication.models.Message;

@RestController   // tells that controller is dealing with http request and response
public class MessageController {
	
	@MessageMapping("/message")  //annotation to receive message
	@SendTo("/topic/return-to")  //annotation tells about the receiver
	public Message getContent(@RequestBody Message message) {
		
		try {
			 Thread.sleep(2000);
			 
		}catch(InterruptedException e ){
			
			e.printStackTrace();
			
		}
		
		return message;
		
	}

}
