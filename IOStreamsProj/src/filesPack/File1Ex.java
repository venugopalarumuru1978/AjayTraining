package filesPack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class File1Ex {

	public static void main(String[] args) throws IOException {
		// writing data into file
		Scanner scObj = new Scanner(System.in);
		FileOutputStream fileObj = new FileOutputStream("E:\\AjaySessions\\FilesInfo\\Demo.txt");
		
		System.out.println("Enter some text ");
		String strinfo = scObj.nextLine();
		
		byte[] info = strinfo.getBytes();  // it will convert string data into byte format.
		
		fileObj.write(info);
		fileObj.close();
		
		System.out.println("Data Written into file...");
	}

}
