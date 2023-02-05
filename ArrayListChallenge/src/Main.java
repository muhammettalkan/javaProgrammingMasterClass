import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ArrayList<String> myList = new ArrayList<>();
		
		boolean flag = true;
		while(flag){
			printActions();
			switch(Integer.parseInt(scan.nextLine())) {
			
			case 0 -> shutDown(myList);
			case 1 -> addItems(myList);
			
			case 2 -> removeItems(myList);
			
			
			default -> flag = false;
			}
		}
		myList.sort(Comparator.naturalOrder());
		System.out.println(myList);

	}
	
	private static void addItems(ArrayList<String> myList) {
		System.out.println("Add item(s) [seperate items by comma]:");
		String[] items = scan.nextLine().split(",");
//		myList.addAll(List.of(items));
		
		for(String i: items) {
			String trimmed = i.trim();
			if(myList.indexOf(trimmed) < 0) {
				myList.add(trimmed);
			}
		}
		System.out.println(myList);
	}
	
	public static void printActions() {
		String textBlock = """
				Available actions:

				0 - to shutdown

				1 - to add item(s) to list (comma delimited list)

				2 - to remove any items (comma delimited list)

				Enter a number for which action you want to do:
				""";
		System.out.println(textBlock + " ");
	}
	
	private static void removeItems(ArrayList<String> myList) {
		System.out.println("Remove item(s) [seperate items by comma]:");
		String[] items = scan.nextLine().split(",");
		
		for(String i: items) {
			String trimmed = i.trim();
			myList.remove(trimmed);
		}
		System.out.println(myList);
	}
	public static void shutDown(ArrayList<String> myList) {
		
		System.out.println("Your final list is: ");
		System.out.println(myList);
	}

}
