package com.design.pattern.adapter;

public class UsaEuropaServiceAdapter {
	public static void main(String[] args) {

		User user;
		UsaService service = new UsaEuropaServiceAdapter.UsaServiceImpl();
		EuropaService europaService = new UsaEuropaServiceAdapter.EuropaServiceImpl();
		
		user = new UsaEuropaServiceAdapter.User();
		
		user.use(service);
		
//		service = new sil.EuropaServiceImpl(); this fails
		System.out.println("after adapter");
		service = new UsaEuropaServiceAdapter.EuropaServiceAdapter(europaService); 
		user.use(service);
	}
	
	static class User{
		
		public void use(UsaService service){
			service.doSth();
		}
	}
	
	interface UsaService{
		void doSth();
	}
	
	static class UsaServiceImpl implements UsaService{

		@Override
		public void doSth() {
			System.out.println("USA service impl");
		}
	}

	interface EuropaService{
		void doAnotherThing();
	}
	
	static class EuropaServiceImpl implements EuropaService{

		@Override
		public void doAnotherThing() {
			System.out.println("Europa Service impl");
		}
	}
	
	static class EuropaServiceAdapter implements UsaService{

		private EuropaService service;
		
		public EuropaServiceAdapter(EuropaService service) {
			this.service = service;
		}
		
		@Override
		public void doSth() {
			service.doAnotherThing();
		}
		
	}
	
}
