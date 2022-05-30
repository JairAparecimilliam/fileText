package application;

import java.io.File;
import java.util.Scanner;

public class FoldersManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner imput = new Scanner(System.in);

		System.out.println("Enter a folder path: ");
		String strPath = imput.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);//listar somente o que for pasta ou diretorio
		System.out.println("FOLDERS");
		for (File folder : folders) {
			System.out.println(folder);
		}
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES");
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created sucessfully " + success);
		imput.close();
	}

}
