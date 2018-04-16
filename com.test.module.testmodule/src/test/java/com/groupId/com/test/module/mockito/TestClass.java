package com.groupId.com.test.module.mockito;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.VerificationModeFactory;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({FooClass.class})
public class TestClass {

	
	@Before
	public void before(){
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		PowerMockito.mockStatic(FooClass.class);
		FooClass fooClassMock = Mockito.mock(FooClass.class);
		fooClassMock.voidMethod();
		
		Mockito.verify(fooClassMock).voidMethod();
		Mockito.verify(fooClassMock, Mockito.times(0)).getString();
		
		PowerMockito.verifyStatic(VerificationModeFactory.times(0));
		FooClass.staticVoidMethod();
		PowerMockito.verifyNoMoreInteractions(FooClass.class);
		
	}

}
