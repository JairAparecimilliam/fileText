package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File file = new File("c:\\ws_program\\in.txt");
		Scanner imput = null;
		try {
			imput = new Scanner(file);
			while (imput.hasNextLine()) {
				System.out.println(imput.nextLine());
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		finally {
			if (imput != null) {
				imput.close();
			}
		}
	}
}
