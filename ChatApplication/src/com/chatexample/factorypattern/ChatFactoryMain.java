package com.chatexample.factorypattern;

public class ChatFactoryMain {

	public static void main(String[] args) {
		ChatServer bb = new ChatServer();

	  GroupChat g1 = bb.getBloodGroup("privatechat");
    
	  g1.getgroupChat();
	      
      GroupChat g2 = bb.getBloodGroup("publicchat");
	    
      g2.getgroupChat();
	      
      GroupChat g3 = bb.getBloodGroup("groupchat");
	       
      g3.getgroupChat();

	}

}
