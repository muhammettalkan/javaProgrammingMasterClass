
public class Main {

	public static void main(String[] args) {
		Printer printer = new Printer(50, true);
		System.out.println("Initial pages count " + printer.getPagesPrinted());
		
		int pagesPrinted = printer.printPages(5);
		System.out.println("Current Job Pages: " + pagesPrinted + " Printer Total: "
				+ printer.getPagesPrinted());	
		
		
		pagesPrinted = printer.printPages(10);
		System.out.println("Current Job Pages: " + pagesPrinted + " Printer Total: "
				+ printer.getPagesPrinted());

	}

}
