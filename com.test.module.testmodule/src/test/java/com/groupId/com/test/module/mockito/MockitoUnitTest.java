package com.groupId.com.test.module.mockito;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.groupId.test.mockito.FooContainerClass;
import com.groupId.test.mockito.FooEntity;
import com.groupId.test.mockito.IFooService;

/**
 *This's method injection using setter method.
 */
public class MockitoUnitTest {

	@InjectMocks
	FooContainerClass fooContainerClass = new FooContainerClass();
	
	@Before
	public void before(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void fooServiceTest(){
		
		IFooService fooService = Mockito.mock(IFooService.class);
		fooContainerClass.setService(fooService);
		
		List<Double> doubleList = new ArrayList<Double>();
		
		//Mock return value
		Mockito.when(fooService.getDoubleList()).thenReturn(doubleList);
		
		List<FooEntity> fooList = new ArrayList<>();
		//Mock return value, with foo entity
		Mockito.when(fooService.getFooList()).thenReturn(fooList);
		
		FooEntity fooEntity = new FooEntity();
		//Mock return value, with single value
		Mockito.when(fooService.returnFooEntity()).thenReturn(fooEntity );
		
		String str = "str";
		//Mock return value
		Mockito.when(fooService.returnString()).thenReturn(str );
		
		//Mock void method, with three argument
		Mockito.doNothing().when(fooService).voidMethodWith3Arguments(Matchers.anyString(), Matchers.anyInt(), Matchers.any(FooEntity.class));
		
		//Mock void method, with no arguments
		Mockito.doNothing().when(fooService).voidMethod();
		
		//Mocking void method, with foo entity list argument
		Mockito.doNothing().when(fooService).setFooList(Matchers.anyListOf(FooEntity.class));
		
		fooContainerClass.callServiceMethods();
	}
	
}
