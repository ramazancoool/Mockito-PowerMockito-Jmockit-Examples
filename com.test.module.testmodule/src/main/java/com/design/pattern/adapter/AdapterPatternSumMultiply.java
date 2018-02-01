package com.design.pattern.adapter;

public class AdapterPatternSumMultiply {

	public static void main(String[] args) {
		User user = new AdapterPatternSumMultiply().new User();
		SumService service;
		MultiplyService multiplyService = new AdapterPatternSumMultiply().new MultiplyServiceImpl();
		
		service = new AdapterPatternSumMultiply().new SumServiceImpl();
		user.use(service, 3, 5);
		
		System.out.println("after adapter");
		
		service = new AdapterPatternSumMultiply().new MultiplyAdapter(multiplyService);
		user.use(service, 3, 5);
			
	}

	class User {
		public void use(SumService service, int a, int b) {
			int x = service.getTotal(a, b);
			System.out.println(x);
		}
	}

	interface SumService {
		int getTotal(int a, int b);
	}

	class SumServiceImpl implements SumService {

		@Override
		public int getTotal(int a, int b) {
			return a + b;
		}
	}

	interface MultiplyService {
		int getProduct(int a, int b);
	}

	class MultiplyServiceImpl implements MultiplyService {

		@Override
		public int getProduct(int a, int b) {
			return a * b;
		}
	}

	class MultiplyAdapter implements SumService {

		private MultiplyService multiplyService;

		public MultiplyAdapter(MultiplyService multiplyService) {
			this.multiplyService = multiplyService;
		}

		@Override
		public int getTotal(int a, int b) {
			return multiplyService.getProduct(a, b);
		}

	}

}
