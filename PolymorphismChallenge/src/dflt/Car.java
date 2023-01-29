package dflt;

public class Car {
	
	private String description;

	public Car(String description) {
		this.description = description;
	}
	
	public void startEngine() {
		System.out.println("Engine started.");
	}
	
	public void drive() {
		System.out.println("Driven cars type is: " + getClass().getSimpleName());
	}
	
	protected void runEngine() {
		System.out.println("Engine is ran");
	}
	
}

class GasPoweredCar extends Car{
	
	private double avgKmPerLiter;
	private int cylinders = 6;

	public GasPoweredCar(String description) {
		super(description);
	}

	public GasPoweredCar(String description, double avgKmPerLiter, int cylinders) {
		super(description);
		this.avgKmPerLiter = avgKmPerLiter;
		this.cylinders = cylinders;
	}

	@Override
	public void startEngine() {
		System.out.printf("Gas -> All %d cylinders are fired up, Ready!%n", cylinders);
	}

	@Override
	protected void runEngine() {
		System.out.printf("Gas -> usage exceeds the average: %.2f %n", avgKmPerLiter);
	}
	
	
	
	
	
	
	
	
	
}