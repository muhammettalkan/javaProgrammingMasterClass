package dflt;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car("2022 Blue Togg");
		runRace(car);
		
		Car ferrari = new GasPoweredCar("2022 Ferrari 296 GTS", 15.4, 6);
		runRace(ferrari);
		
		
	}
	
	public static void runRace(Car car) {
		car.startEngine();
		car.drive();
	}
	
}
