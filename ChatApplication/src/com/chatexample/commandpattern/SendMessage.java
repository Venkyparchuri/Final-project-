package com.chatexample.commandpattern;

public class SendMessage implements NewContact{

	MessageRequest hr;
	public SendMessage(MessageRequest hr) {
		this.hr = hr;
	}
	@Override
	public void addContact() {
		hr.send();
		
	}
	


}
