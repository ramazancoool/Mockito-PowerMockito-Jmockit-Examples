package com.design.pattern.adapter;

public class PhoneAdapterExample {

	public static void main(String[] args) {
		User user;
		Phone phone = new Phone();
		ISamsungCharger samsungCharger = new PhoneAdapterExample.SumsungChargerImpl();
		IIphoneCharger iphoneCharger = new PhoneAdapterExample.IIphoneChargerImpl();
		
		user = new PhoneAdapterExample.User(phone);
		user.useCharger(samsungCharger);
		
		//user.useCharger(iphoneCharger); this get compile error
		System.out.println("after adapter");
		samsungCharger = new PhoneAdapterExample.SamsungAdapter(iphoneCharger);
		user.useCharger(samsungCharger);
		
	}
	
	static class User{
		private Phone phone;
		
		public User(Phone phone) {
			this.phone = phone;
		}
		
		public void useCharger(ISamsungCharger charger){
			charger.charge(phone);
		}
	}
	
	static class Phone{}
	
	interface ISamsungCharger{
		public void charge(Phone phone);
	}
	
	static class SumsungChargerImpl implements ISamsungCharger{

		@Override
		public void charge(Phone phone) {}
		
	}
	
	interface IIphoneCharger{
		public void chargeDifferently(Phone phone);
	}
	
	static class IIphoneChargerImpl implements IIphoneCharger{

		@Override
		public void chargeDifferently(Phone phone) {}
		
	}
	
	static class SamsungAdapter implements ISamsungCharger{

		private IIphoneCharger iphoneCharger;

		public SamsungAdapter(IIphoneCharger iphoneCharger) {
			this.iphoneCharger = iphoneCharger;
		}
		
		@Override
		public void charge(Phone phone) {
			iphoneCharger.chargeDifferently(phone);
		}
	}
}
