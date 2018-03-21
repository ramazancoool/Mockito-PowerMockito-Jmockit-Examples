package com.groupId.test.mockito;

import java.util.ArrayList;
import java.util.List;

public class FooContainerClass {

	private IFooService service;

	public void setService(IFooService service) {
		this.service = service;
	}
	
	public void callServiceMethods(){
		String str = "str";
		Integer intValue = Integer.valueOf(1);
		FooEntity fooEntity = new FooEntity();
		
		
		service.voidMethodWith3Arguments(str , intValue , fooEntity );
		service.voidMethod();
		List<Double> doubleList = service.getDoubleList();
		List<FooEntity> fooList = service.getFooList();
		FooEntity fooEntityResult = service.returnFooEntity();
		String resultString = service.returnString();
		service.setFooList(new ArrayList<FooEntity>());
		
		System.out.println(doubleList);
		System.out.println(fooList);
		System.out.println(fooEntityResult);
		System.out.println(resultString);
	}
	
	
	
}
