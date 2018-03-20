package weekThree;

public class TestInHCon {

	public static void main(String[] args) {

		AnotherInHCon obj = new AnotherInHCon();// is inheriting from InHConcepts class
		System.out.println("they have some total "+obj.classroom(2)+" books in the class");
		System.out.println("they have some total "+obj.classroom(2, 3)+" school supplies.");
		obj.computer();
		InHConcepts.schoolName();
	
	}

}
