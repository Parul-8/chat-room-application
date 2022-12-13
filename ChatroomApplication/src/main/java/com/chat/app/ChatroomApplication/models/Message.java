package com.chat.app.ChatroomApplication.models;

public class Message {
	private String name;
	private String content;
	
	Message(String name, String content){
		this.name = name;
		this.content = content;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

   


	@Override
	public String toString() {
		return "Message [name=" + name + ", content=" + content + "]";
	}

}
