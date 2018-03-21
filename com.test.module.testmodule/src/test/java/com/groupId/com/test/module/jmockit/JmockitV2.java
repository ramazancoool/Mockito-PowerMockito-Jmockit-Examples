package com.groupId.com.test.module.jmockit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.groupId.test.module.FinalClass;
import com.groupId.test.module.FooClass;
import com.groupId.test.module.FooService;
import com.groupId.test.module.InitClass;
import com.groupId.test.module.StaticMethodClass;

import mockit.Expectations;
import mockit.Injectable;
import mockit.Mock;
import mockit.MockUp;
import mockit.Tested;
import mockit.Verifications;
import mockit.integration.junit4.JMockit;

@RunWith(JMockit.class)
public class JmockitV2 {
	
	@Tested
	FooClass fooClass;
	
	@Injectable
	FooService fooServiceMock;
	
	@Injectable
	StaticMethodClass staticMethodClassMock;
	
	@Injectable
	FinalClass finalClassMock;
	
	@Test
	public void fooClassTest(){
		new MockUp<InitClass>() {
			@Mock
			public void $init(){
				
			}
			@Mock
			public String methodMsg(){
				return "mock message";
			}
			
		};
		
		
		fooClass.constructorTest();
		fooClass.methodMsg();
	}

	@Test
	public void fooClassTest2(){
		new Expectations() {{
			fooServiceMock.sumService();
			result = "mock message from expectations";
		}};
		
		fooClass.doSth();
	}
	
	@Test
	public void staticMethodTest(){
		
		new MockUp<StaticMethodClass>() {
			@Mock
			public StaticMethodClass getInstance(){
				return staticMethodClassMock;
			}

			@Mock
			public String getMessage(){
				return "Mocked Message";
			}
		};
		
		fooClass.staticMethodCall();
	}
	
	@Test
	public void finalClassMethodTest(){
		
		new MockUp<FinalClass>() {
			@Mock
			public void $init(){
				
			}
			
			@Mock
			public String finalMethod(){
				return "final mock message";
			}
		};
		fooClass.finalClassMethodCall();
		
		new Verifications() {{
			assertTrue(finalClassMock.finalMethod().equals("final mock message"));
			
		}};
	}
}
