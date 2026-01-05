package filesPack;

import java.io.FileInputStream;

import java.io.IOException;

public class File3Ex {

	public static void main(String[] args) throws IOException {
		// reading data file file
		
		FileInputStream fileObj = new FileInputStream("E:\\AjaySessions\\FilesInfo\\Demo.txt");
	
		int ch = fileObj.read();
		
		while(ch!=-1)
		{
			System.out.print((char)ch);
			ch = fileObj.read();
		}
		fileObj.close();
	}

}
