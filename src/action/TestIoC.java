package action;

import model.BMW;
import model.Car;
import model.Volkswagen;

public class TestIoC {

	public static void main(String[] args) {
	
		// Creating the BWM object to Car interface
		Car car1 = new BMW();
		
		// Creat,ng the Volkswagen from via Car interface
		Car car2 = new Volkswagen();
		
		
		
	}

}
