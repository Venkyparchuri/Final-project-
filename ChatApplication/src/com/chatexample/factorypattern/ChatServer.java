package com.chatexample.factorypattern;

public class ChatServer {

	public GroupChat getBloodGroup(String chatType){
	      if(chatType == null){
	         return null;
	      }		
	      if(chatType.equalsIgnoreCase("privatechat")){
	         return new Sender();
	         
	      } else if(chatType.equalsIgnoreCase("publicchat")){
	         return new Receiver();
	         
	      } else if(chatType.equalsIgnoreCase("groupchat")){
	         return new Media();
	      }
	      
	      return null;
	   }
}
