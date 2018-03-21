package com.groupId.com.test.module.mockito;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.groupId.test.mockito.FooContainerClass;
import com.groupId.test.mockito.IFooService;
/**
 *This's field injection. The field's all methods are empty and return null
 */
public class MockitoUnitTestWithInjection {

	@InjectMocks
	FooContainerClass fooContainerClass = new FooContainerClass();
	
	@Mock
	IFooService fooService;
	
	@Before
	public void before(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void fooServiceTest(){
		//All fooService methods are empty and return null, so if you don't you return value of service method, you don't have to mock methods.
		fooContainerClass.callServiceMethods();
	}
	
}
