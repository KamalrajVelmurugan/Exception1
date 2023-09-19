package exception;

public class Name {

	public static void main(String[] args) {
		String name = null;
		//System.out.println(name.length());
		try {
			String b = name;
			System.out.println(b.length());
		} catch(NullPointerException np) {
			System.out.println("name does not recived");
			System.out.println(np);
			np.printStackTrace();
			
		}

	}

}
