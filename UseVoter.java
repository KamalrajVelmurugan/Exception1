package exception;

public class UseVoter {

	public static void main(String[] args) throws InvalidAgeException {
		int age = 18;
		if(age < 18) {
			throw new InvalidAgeException("Invalid Age");
		}
		else {
			System.out.println("Eligible to vote");
		}

	}

}
