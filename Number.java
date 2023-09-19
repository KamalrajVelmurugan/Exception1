package exception;

public class Number {

	public static void main(String[] args) {
		String val ="hi";
		//int num =Integer.parseInt(val);
		try {
			int num = Integer.parseInt(val);
			System.out.println(num);
		} catch(NumberFormatException nf) {
			System.out.println("we can't convert string to integer");
			System.out.println(nf);
			nf.printStackTrace();
		}

	}

}
