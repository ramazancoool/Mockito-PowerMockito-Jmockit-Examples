package com.groupId.com.test.module.testmodule;

public class FooClass {
	
	private FooService service;
	
	public void doSth(){
		String result = service.sumService();
		System.out.println(result);
	}
	
	public void constructorTest(){
		InitClass initClass = new InitClass();
		initClass.doSth();
	}
	
	public void methodMsg(){
		InitClass initClass = new InitClass();
		String result = initClass.methodMsg();
		System.out.println(result);
	}
	
	public void staticMethodCall(){
		StaticMethodClass staticMethodClass = StaticMethodClass.getInstance();
		staticMethodClass.doSth();
		String result = staticMethodClass.returnSth();
		String returnResult = StaticMethodClass.getMessage();
		System.out.println(result + " " + returnResult);
	}
	
	public void finalClassMethodCall(){
		FinalClass finalClass = new FinalClass();
		String result = finalClass.finalMethod();
		System.out.println(result);
	}
}
