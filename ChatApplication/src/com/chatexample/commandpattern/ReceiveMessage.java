package com.chatexample.commandpattern;

public class ReceiveMessage implements NewContact{

	MessageRequest hr;
	public ReceiveMessage(MessageRequest hr) {
		this.hr = hr;
	}
	@Override
	public void addContact() {
		hr.receive();
		
	}
	


}
