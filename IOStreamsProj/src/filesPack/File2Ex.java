package filesPack;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File2Ex {

	public static void main(String[] args) throws IOException {
		// writing data into file
		Scanner scObj = new Scanner(System.in);

		FileWriter fwObj = new FileWriter("E:\\AjaySessions\\FilesInfo\\Test.txt", true);
		
		System.out.println("Enter some text ");
		String strinfo = scObj.nextLine();

		fwObj.write(strinfo);
		fwObj.close();
		
		
		System.out.println("Data Written into file...");
	}

}
