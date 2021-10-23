package com.chatexample.adapterpattern;

public class ChatInvoker implements GroupChatStatus{

	ChatServerAdapter cladapter;

	@Override
	public void getChatDetails(String chatType, String contactName) {
		
		if(chatType.equalsIgnoreCase("Single")){
	         System.out.println("Contact: "+contactName+" sent message in: " + chatType);			
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
	      else if(chatType.equalsIgnoreCase("Group") || contactName.equalsIgnoreCase("Single")){
	    	  cladapter = new ChatServerAdapter(chatType);
	    	  cladapter.getChatDetails(chatType, contactName);
	      }
	      
	      else{
	         System.out.println("Invalid chat type " + chatType);
	      }
		
	}
	
}
