package exception;

public class Task_2NestedException {

	public static void main(String[] args) {
		try {
			String [] a = {"Name","raja","ravi"};
			System.out.println(a[0].charAt(10));
			System.out.println(a[12]);
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println(ae);
		} catch(StringIndexOutOfBoundsException sib) {
			System.out.println(sib);
		}catch(Exception e) {
			System.out.println("Out of bounds");
		}finally {
			System.out.println("finished");
		}

	}

}
