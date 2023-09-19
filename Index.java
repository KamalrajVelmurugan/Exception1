package exception;

public class Index {

	public static void main(String[] args) {
		String name = "kamal";
		//System.out.println(name.charAt(9));
		try {
			System.out.println(name.charAt(9));
		}catch(StringIndexOutOfBoundsException sib) {
			System.out.println("String is outOfBounds");
			System.out.println(sib);
			sib.printStackTrace();
		}

	}

}
