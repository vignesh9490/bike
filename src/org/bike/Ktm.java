package org.bike;
//fully abstraction
public class Ktm implements Bike {

	@Override
	public void cost() {
		System.out.println("cost of the 300cc KTM bike is:385000");
	}
	@Override
	public void speed() {
		System.out.println("speed of the 300cc KTM bike is:up to 170km/hr");
		
	}
	public static void main(String[] args) {
		Ktm a = new Ktm();
		a.cost();
		a.speed();
		a.cc();
		a.edition1();
	}
	@Override
	public void edition1() {
	 System.out.println("first edition");
     System.out.println("fourth edition");
		
	}
	@Override
	public void cc() {
		System.out.println("153cc");

		System.out.println("350cc");


	}
	@Override
	public void edition() {
		System.out.println("third edition");


		
	}

}
