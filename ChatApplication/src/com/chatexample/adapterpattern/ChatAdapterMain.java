package com.chatexample.adapterpattern;


public class ChatAdapterMain {

	public static void main(String[] args) {
		ChatInvoker st = new ChatInvoker();

		st.getChatDetails("Group", "Hari");
		st.getChatDetails("Single", "Vishwa");
		st.getChatDetails("Single", "Ram");
		st.getChatDetails("D", "Shankar");

	}

}
