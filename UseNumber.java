package exception;

public class UseNumber {

	public static void main(String[] args) throws InvalidMobileNumber {
		int a = 123456789;
		if(a !=a) {
			throw new InvalidMobileNumber("Invalid Number");
		}
		else {
			System.out.println("call Connect");
		}

	}

}
