package com.groupId.test.mockito;

import java.util.List;

public class FooServiceImpl implements IMockitoFooService {

	@Override
	public void voidMethod() {
		throw new RuntimeException("RuntimeException message");
	}

	@Override
	public String returnString() {
		throw new RuntimeException("RuntimeException message");
	}

	@Override
	public FooEntity returnFooEntity() {
		throw new RuntimeException("RuntimeException message");
	}

	@Override
	public void voidMethodWith3Arguments(String str, Integer intValue, FooEntity fooEntity) {
		throw new RuntimeException("RuntimeException message");
	}

	@Override
	public List<Double> getDoubleList() {
		throw new RuntimeException("RuntimeException message");
	}

	@Override
	public List<FooEntity> getFooList() {
		throw new RuntimeException("RuntimeException message");
	}

	@Override
	public void setFooList(List<FooEntity> fooList) {
		throw new RuntimeException("RuntimeException message");
	}

}
