package weekThree;

public class TestEConcepts {

	public static void main(String[] args) {

		EnCapConcept enConcept = new EnCapConcept();
		enConcept.setEmpID(127);
		enConcept.setEmpName("Albert");
		enConcept.setEmpDOB("1-1-1980");
		enConcept.setEmpSalary(99000.99);
		
		System.out.println("This employee Mr "+enConcept.getEmpName()+" has employee ID as "+enConcept.getEmpID()+" and his DOB is "+enConcept.getEmpDOB()+ " and making "+enConcept.getEmpSalary()+ "/year.");

		
	}

}
