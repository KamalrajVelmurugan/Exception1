package exception;

public class Task_NestedException {

	public static void main(String[] args) {
		float [] a = {10.02f,45.4f,77.434f };
		//System.out.println(a[10]);
		try {
			System.out.println(a[10]);
		}catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
