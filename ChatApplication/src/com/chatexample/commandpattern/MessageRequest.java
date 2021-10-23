package com.chatexample.commandpattern;

public class MessageRequest {

	private String contactName;
	private int phoneNo;
	
	
	
	
	public MessageRequest(String contactName, int phoneNo) {
		
		this.contactName = contactName;
		this.phoneNo = phoneNo;
		
	}
	public void receive() {
		System.out.println("New Contact "+contactName+" addedd with phone No "+phoneNo);
	}
	public void send() {
		System.out.println("New Contact "+contactName+" addedd with phone No "+phoneNo+" and message sent");
	}
}
