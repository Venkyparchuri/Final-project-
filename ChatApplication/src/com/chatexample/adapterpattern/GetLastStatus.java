package com.chatexample.adapterpattern;

public class GetLastStatus implements SingleChat{

	@Override
	public void getLastStatus(String contactName) {
		System.out.println("Last status is 10:00 PM for contact "+contactName);
		
	}

	@Override
	public void changeProfile(String contactName) {
		
		
	}

	

	

}
