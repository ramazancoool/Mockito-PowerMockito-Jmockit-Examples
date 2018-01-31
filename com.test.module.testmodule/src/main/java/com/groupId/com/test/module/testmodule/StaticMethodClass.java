package com.groupId.com.test.module.testmodule;

public class StaticMethodClass {
	
	
	private static StaticMethodClass instance;
	
	public static StaticMethodClass getInstance(){
		if(instance == null){
			instance = new StaticMethodClass();
		}
		throw new RuntimeException("getinstance exception");
//		return instance;
	}
	
	public static String getMessage(){
		return "real method message";
	}
	
	public void doSth(){
		throw new RuntimeException("doSth");
	}
	
	public String returnSth(){
		throw new RuntimeException("returnSth");
	}
}
