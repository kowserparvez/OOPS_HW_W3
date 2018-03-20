package weekThree;

public class TestSchool {

	public static void main(String[] args) {

		// obj have access to all the interfaces and classes methods
		FIrst_Grade obj = new FIrst_Grade();
		obj.breakTime();
		obj.sleep();
		obj.gameday();
		obj.lunch();
		obj.practice();
		obj.pray();
		obj.study();
		obj.dailyHomework();
		obj.dailyReports();
		System.out.println("**********");
		//only have access to the School interface methods
		School school  =new FIrst_Grade();
		school.breakTime();
		school.lunch();
		school.study();
		System.out.println("**********"); 
		//only have access to Homeworks class methods
		Homeworks homeworks  =new FIrst_Grade();
		homeworks.dailyHomework();
		homeworks.dailyReports();
		System.out.println("**********"); 
		//only have access to Sports interface methods
		Sports sports  =new FIrst_Grade();
		sports.gameday();
		sports.practice();
		

	}

}
