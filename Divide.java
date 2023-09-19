package exception;

public class Divide {

	public static void main(String[] args) {
		System.out.println("Welcome");
		int a =10;
		int b =0;
		try {
			int c = a/b;
			System.out.println(c);
			
		} catch(ArithmeticException ae) {
			System.out.println("We can't divide a Number");
			System.out.println(ae);
			ae.printStackTrace();
		}
		System.out.println("thankyou");
		

	}

}
