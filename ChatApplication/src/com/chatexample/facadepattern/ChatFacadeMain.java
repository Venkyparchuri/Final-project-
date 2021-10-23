package com.chatexample.facadepattern;

public class ChatFacadeMain {

	public static void main(String[] args) {
		ChatServer bb = new ChatServer();

		bb.getSender();
		bb.getReceiver();
		bb.getMedia();

	}

}
