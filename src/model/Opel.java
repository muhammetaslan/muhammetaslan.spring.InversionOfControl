package model;

public class Opel implements Car {

	@Override
	public void driveCar() {
		
		System.out.println("I am driving Opel");
	}

	@Override
	public void stopCar() {
		
		System.out.println("I am stoping Opel");
	}

	@Override
	public void takePassenger(int numberOfPassenger) {
		
		System.out.println("I take " + numberOfPassenger + " of passenger");
	}

	@Override
	public void sellCar(int carId) {
		
		
	}

	@Override
	public void buyCar(int carId) {
		
		
	}

	@Override
	public String getModel() {
		
		return "Opel Corsa";
	}

	@Override
	public int price() {
		
		return 28000;
	}
}
