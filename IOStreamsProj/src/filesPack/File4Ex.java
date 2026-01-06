package filesPack;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class File4Ex {

	public static void main(String[] args) throws IOException {
		// reading data file file
		
		FileReader frObj = new FileReader("E:\\AjaySessions\\FilesInfo\\Demo.txt");
		BufferedReader  brObj = new BufferedReader(frObj);
	
		String finfo = brObj.readLine();
		
		while(finfo!=null)
		{
				System.out.println(finfo);
				finfo = brObj.readLine();
		}
		brObj.close();
		frObj.close();
	}
}
