package com.groupId.test.mockito;

import java.util.List;

public interface IMockitoFooService {

	void voidMethod();
	String returnString();
	FooEntity returnFooEntity();
	void voidMethodWith3Arguments(String str, Integer intValue, FooEntity fooEntity);
	List<Double> getDoubleList();
	List<FooEntity> getFooList();
	void setFooList(List<FooEntity> fooList);
	
}
