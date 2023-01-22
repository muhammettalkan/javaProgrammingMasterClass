
public class Main {

	public static void main(String[] args) {
		printInformation("Hello World");
		printInformation("");
		printInformation("  ");
		
		String helloWorld = "Hello World";
		System.out.println("index of r = " + helloWorld.indexOf('r'));
		System.out.println("index of World = " + helloWorld.indexOf("World"));
		
		System.out.println("index of l = " + helloWorld.indexOf('l'));
		System.out.println("index of l = " + helloWorld.lastIndexOf('l'));
		
		System.out.println("index of l = " + helloWorld.indexOf('l',3));
		System.out.println("index of l = " + helloWorld.lastIndexOf('l'
				,8));
		
		String helloWorldLower = helloWorld.toLowerCase();
		if(helloWorld.equals(helloWorldLower)) {
			System.out.println("Values match exactly");
		}
		if(helloWorld.equalsIgnoreCase(helloWorldLower)) {
			System.out.println("Values match ignoring case");
		}
		
		if(helloWorld.startsWith("Hello")) {
			System.out.println("String starts with Hello");
		}
		
		if(helloWorld.endsWith("Hello")) {
			System.out.println("String starts with World");
		}
		
		if(helloWorld.contains("Hello")) {
			System.out.println("String contains World");
		}
		
		if(helloWorld.contentEquals("Hello World")) {
			System.out.println("Values match exactly");
		}
		
	}
	
	public static void printInformation(String string) {
		int length = string.length();
		System.out.println("Length = " + length);
		
		if(string.isEmpty()) {
			System.out.println("String is empty");
			return;
		}
		
		if(string.isBlank()) {
			System.out.println("String is Blank");
		}
		System.out.println("First char = " + string.charAt(0));
		System.out.println("Last char = " + string.charAt(length-1));
		
		
	}
}
