package com.groupId.test.powermockito;

public class FactoryClass {

	public static ServiceClass getPowerMockitoClass(){
		return new ServiceClass();
	}

	public static ServiceClass getPowerMockitoClassWithArgument(){
		return new ServiceClass("str", new FooEntity());
	}
}
