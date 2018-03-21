package com.groupId.test.powermockito;

public class ContainerClass {


	public void callStaticMethod(){
		Integer intValue = Integer.valueOf(1);
		String str = "str";
		FooEntity fooEntity = new FooEntity();

		ServiceClass.staticVoidMethod();
		ServiceClass.stringMethod(intValue, str, fooEntity);
	}

	public void callNonStaticMethod(){
		ServiceClass powerMockitoClass = FactoryClass.getPowerMockitoClass();
		powerMockitoClass.nonStaticMethod();
	}

	public void callNonStaticMethodWithParam(){
		ServiceClass powerMockitoClass = FactoryClass.getPowerMockitoClassWithArgument();
		powerMockitoClass.nonStaticMethod();
	}
}
