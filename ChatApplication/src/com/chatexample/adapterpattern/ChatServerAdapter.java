package com.chatexample.adapterpattern;

public class ChatServerAdapter implements GroupChatStatus {

	SingleChat bd;
	
	public ChatServerAdapter(String chatType) {
		
		if(chatType.equalsIgnoreCase("Single")) {
			bd = new GetLastStatus();
		}else if(chatType.equalsIgnoreCase("Group")) {
			bd = new ChangeProfile();
		}
	}
	
	@Override
	public void getChatDetails(String chatType, String contactName) {
		
		if(chatType.equalsIgnoreCase("Group")) {
			bd.changeProfile(contactName);
		}else if(chatType.equalsIgnoreCase("Single")) {
			bd.getLastStatus(contactName);
		}
	}

}
