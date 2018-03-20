package weekThree;

public class InHConcepts {
	int book; // non static variable
	int pen;// non static variable
	static int computer; // static variable
	static final String name ="Tracy Elementary";

	public int classroom(int book) { // non static method
		this.book = book ;
		return book;
	}
	// method overloading ... one with one int type and another method with two int variables
	public int classroom(int book,int pen) {
		this.book = book;
		this.pen =pen;
		int total = book+pen;
		return total; 
	}
	public void computer() {
		computer = 3;
		System.out.println("they have "+computer+" computers also in the class.");
	}
	
	public static void schoolName() { // static method
		System.out.println("Name of the School is: "+name);
	}
			
}


//super() can be used to invoke immediate parent class constructor.
//super can be used to invoke immediate parent class method.
//super can be used to refer immediate parent class instance variable.