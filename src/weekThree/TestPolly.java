package weekThree;

public class TestPolly {

	public static void main(String[] args) {
		
		PollyOne pollyone= new PollyOne();
		System.out.println(pollyone.polly(4));
		System.out.println(pollyone.polly(4, 1));
		System.out.println(pollyone.polly(5, 3, 2));
		System.out.println(pollyone.polly(5, 4, 1, 10));
		
		
		PollyTwo pollytwo = new PollyTwo();
		System.out.println(pollytwo.polly(3, 2, 4, 1)+" is the number");

	}

}
