package exception;

public class Number1_Index {

	public static void main(String[] args) {
		int [] num = {1,2,3,4};
		//System.out.println(num[7]);
		try {
			System.out.println(num[7]);
		} catch(ArrayIndexOutOfBoundsException aib) {
			System.out.println("Array index out of bounds");
			System.out.println(aib);
			aib.printStackTrace();
		} finally {
			System.out.println("Thanks");
		}

	}

}
