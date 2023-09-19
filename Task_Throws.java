package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Task_Throws {

	public static void main(String[] args) throws IOException  {
		try {
			File f = new File("D:\\text\\jav/.txt");
			FileReader fr = new FileReader(f);
			int temp =0;
			while((temp = fr.read())!=-1) {
				System.out.print((char)(temp));
			}
		} 
		catch(FileNotFoundException fne) {
			System.out.println("File not found error");
			System.out.println(fne);
			//fne.printStackTrace();
		}
		

	}

}
