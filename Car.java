
public class Car {
	private int doors = 4;
	private String model = "Porsche";
	private String make = "Carrera";
	private String color = "Golden";
	private boolean convertible = true;
	
	public void setModel(String model) {
		String validModel = model.toLowerCase();
		if(validModel.equals("carrera") || validModel.equals("holden")) {
			this.model = model;
		}else {
			this.model = "Unknown";
		}
	}
	
	public String getModel() {
		return this.model;
	}
	
	public void describeCar() {
		System.out.println(doors + "-Door " + color + " "
							+ make + " " + (convertible ? "Convertible" : ""));
		
	}
	
	public String getMake() {
		return make;
	}
	
	public void setMake(String make) {
		this.make = make;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setConvertible(boolean convertible) {
		this.convertible = convertible;
	}

	public String getColor() {
		return color;
	}

	public boolean isConvertible() {
		return convertible;
	}
	
}
