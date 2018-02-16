package model;

public class Volkswagen implements Car {

	@Override
	public void driveCar() {
		
		System.out.println("I am driving Volkswagen");
	}

	@Override
	public void stopCar() {
		
		System.out.println("I am stoping Volkswagen");
	}

	@Override
	public void takePassenger(int numberOfPassenger) {
		
		System.out.println("I am taking " + numberOfPassenger + " of passenger");
	}

	@Override
	public void sellCar(int carId) {
		
		
	}

	@Override
	public void buyCar(int carId) {
		
		
	}

	@Override
	public String getModel() {
		
		return "Volkswagen jetta";
	}

	@Override
	public int price() {
		
		return 58500;
	}
}
