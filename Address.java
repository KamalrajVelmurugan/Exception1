package exception;

public class Address {

	public static void main(String[] args) throws InvalidAddres {
		String add = "panruti";
		if(add.equalsIgnoreCase("panruti")) {
			throw new InvalidAddres("Same Address");
		}
		else {
			System.out.println("Not Same Address");
		}

	}

}
