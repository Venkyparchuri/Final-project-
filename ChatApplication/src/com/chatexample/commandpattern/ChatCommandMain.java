package com.chatexample.commandpattern;



public class ChatCommandMain {

	public static void main(String[] args) {
		MessageRequest h1 = new MessageRequest("Mark",1455);
		MessageRequest h2 = new MessageRequest("Jack",5266);
		MessageRequest h3 = new MessageRequest("Peter",8799);

		ReceiveMessage r1 = new ReceiveMessage(h1);
		ReceiveMessage r2 = new ReceiveMessage(h2);
		ReceiveMessage r3 = new ReceiveMessage(h3);
		SendMessage rs1 = new SendMessage(h1);
		SendMessage rs2 = new SendMessage(h2);

		ChatServer broker = new ChatServer();
	      broker.getChatList(r1);
	      broker.getChatList(r2);
	      broker.getChatList(r3);
	      broker.getChatList(rs1);
	      broker.getChatList(rs2);

	      broker.storeChatDetails();
		

	}

}
