package exception;

public class UseEmail {

	public static void main(String[] args) throws InvalidEmail {
		String mail = "@";
		if(mail != mail) {
			throw new InvalidEmail("Inavlid EMail  Id");
		}
		else {
			System.out.println("This is EMail Id");
		}

	}

}
