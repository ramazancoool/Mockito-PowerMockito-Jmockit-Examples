package com.groupId.test.powermockito;

public class ServiceClass {

	public ServiceClass() {
		throw new RuntimeException("exception message");
	}

	public ServiceClass(String str, FooEntity fooEntity) {
		throw new RuntimeException("exception message");
	}
	
	public static void staticVoidMethod(){
		throw new RuntimeException("exception message");
	}
	
	public static String stringMethod(Integer intValue, String str, FooEntity fooEntity){
		throw new RuntimeException("exception message");
	}
	
	public void nonStaticMethod(){
		throw new RuntimeException("exception message");
	}
}
