package com.chatexample.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class ChatServer {

	private List<NewContact> contactList = new ArrayList<NewContact>(); 

	   public void getChatList(NewContact order){
		   contactList.add(order);		
	   }

	   public void storeChatDetails(){
	   
	      for (NewContact order : contactList) {
	         order.addContact();
	      }
	      contactList.clear();
	   }
}
