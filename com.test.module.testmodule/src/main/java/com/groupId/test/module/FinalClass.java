package com.groupId.test.module;

public final class FinalClass {

	public FinalClass(){
		throw new RuntimeException("finalClass constructor exception");
	}
	
	public final String  finalMethod(){
		throw new RuntimeException("final method1 exception");
	}
}
