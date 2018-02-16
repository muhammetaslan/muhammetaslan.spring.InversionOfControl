package model;

public class BMW implements Car {

	@Override
	public void driveCar() {
		
		System.out.println("I am driving BMW ");
	}

	@Override
	public void stopCar() {
		
		System.out.println("I am stop the BMW");
	}

	@Override
	public void takePassenger(int numberOfPassenger) {
		
		System.out.println("I take "  + numberOfPassenger + " of passenger");
	}

	@Override
	public void sellCar(int carId) {
		
		
	}

	@Override
	public void buyCar(int carId) {
		
		
	}

	@Override
	public String getModel() {
		
		return "BMW 520 d";
	}

	@Override
	public int price() {
		
		return 186000;
	}

}
