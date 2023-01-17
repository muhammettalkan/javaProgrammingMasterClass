
public class Main {

	public static void main(String[] args) {
		
		for(int i=1; i <= 5; i++) {
			RecordStudent s = new RecordStudent("S92300" + i,
					switch(i) {
					case 1 -> "Mary";
					case 2 -> "Carol";
					case 3 -> "Tim";
					case 4 -> "Harry";
					case 5 -> "Lisa";
					default -> "Anonymous";
					}, "05/11/1985",
					"Java Masterclass");
			System.out.println(s);
		}
		
		Student pojoStudent = new Student("S923006", "ann",
				"05/07/1985", "Java Masterclass");
		
		RecordStudent recordStudent = new RecordStudent("S923007", "Bill", "05/11/1985", "Java Masterclass");
		
		System.out.println(pojoStudent);
		System.out.println(recordStudent);
		
		System.out.println(pojoStudent.getName() + " is taking");
		System.out.println(recordStudent.name() + " is taking");
	}

}
