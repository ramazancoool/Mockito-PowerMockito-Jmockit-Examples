package com.groupId.test.module;

public class InitClass {

	public InitClass() {
		throw new RuntimeException("exception constructor");
	}
	
	public void doSth(){
		
	}
	
	public String methodMsg(){
		return "real method";
	}
}
