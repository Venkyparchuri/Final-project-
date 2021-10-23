package com.chatexample.adapterpattern;

public class ChangeProfile implements SingleChat{

	@Override
	public void getLastStatus(String contactName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changeProfile(String contactName) {
		System.out.println("Profile change implemented for contact "+contactName);
		
	}

	

	

}
