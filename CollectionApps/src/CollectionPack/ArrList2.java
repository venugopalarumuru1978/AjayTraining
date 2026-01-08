package CollectionPack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrList2 {

	public static void main(String[] args) {

		List<Integer>  arrLst = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		do
		{
			System.out.println("Enter any value ");
			int n = sc.nextInt();
			arrLst.add(n);
			
			System.out.println("Do u want to continue(y/n)");
			String ch = sc.next();
			if(ch.equalsIgnoreCase("n"))
				break;
		}
		while(true);
		
		System.out.println(arrLst);
	}

}
