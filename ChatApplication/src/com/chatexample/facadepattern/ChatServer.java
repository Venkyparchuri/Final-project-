package com.chatexample.facadepattern;

public class ChatServer {
	
	GroupChat sender;
	GroupChat receiver;
	GroupChat media;
	
	public ChatServer() {
		sender = new Sender();
		receiver = new Receiver();
		media = new Media();
	}
	
	public void getSender() {
		sender.getgroupChat();
	}

	public void getReceiver() {
		receiver.getgroupChat();
	}

	public void getMedia() {
		media.getgroupChat();
	}
	
}
