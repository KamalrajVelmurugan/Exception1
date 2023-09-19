package exception;

public class Task_Fianlly {

	public static void main(String[] args) {
		int a =100;
		int b =10;
		try {
			int c = a/b;
			System.out.println(c);
			
		}catch(Exception ae) {
			System.out.println("arithmetic error");
			System.out.println(ae);
			ae.printStackTrace();
		}finally {
			System.out.println("divide a/b");
		}

	}

}
