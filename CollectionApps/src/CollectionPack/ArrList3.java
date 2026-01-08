package CollectionPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrList3 {

	public static void main(String[] args) {

		List<Integer>  arrLst = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter any value[-1 to stop] ");
			int n = sc.nextInt();
			if(n==-1)
				break;
			
			arrLst.add(n);
		}
		while(true);
		
		System.out.println(arrLst);
	}

}
