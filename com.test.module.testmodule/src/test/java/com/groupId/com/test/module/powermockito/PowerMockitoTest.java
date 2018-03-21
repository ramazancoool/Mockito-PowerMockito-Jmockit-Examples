package com.groupId.com.test.module.powermockito;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import com.groupId.test.powermockito.ContainerClass;
import com.groupId.test.powermockito.FactoryClass;
import com.groupId.test.powermockito.FooEntity;
import com.groupId.test.powermockito.ServiceClass;

@RunWith(PowerMockRunner.class)
@PrepareForTest({ServiceClass.class, FactoryClass.class})
public class PowerMockitoTest {

	@InjectMocks
	ContainerClass containerClass = new ContainerClass() ;
	
	@Before
	public void before(){
		MockitoAnnotations.initMocks(this);
	}
	
	@Test
	public void staticMethodTest(){
		//When you say mockStatic all static void methods are empty and non-void methods returns null
		PowerMockito.mockStatic(ServiceClass.class);
		
		String strValue = "mock result str";
		String result = null;
		PowerMockito.when(ServiceClass.stringMethod(Matchers.anyInt(), Matchers.anyString(), Matchers.any(FooEntity.class))).thenReturn(strValue );
	
		result = ServiceClass.stringMethod(1, "str", new FooEntity());
		assertTrue(result.equals(strValue));
		
		ServiceClass.staticVoidMethod();
	}
	
	@Test
	public void constructorTest() throws Exception{
		ServiceClass serviceClass = PowerMockito.mock(ServiceClass.class);
		
		PowerMockito.whenNew(ServiceClass.class).withNoArguments().thenReturn(serviceClass);
		containerClass.callNonStaticMethod();

		PowerMockito.whenNew(ServiceClass.class).withAnyArguments().thenReturn(serviceClass);
		containerClass.callNonStaticMethodWithParam();
	}
}
