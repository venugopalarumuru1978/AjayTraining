package SortPack;

import java.util.Arrays;
import java.util.Comparator;

public class SortEx1 {

	public static void main(String[] args) {

			int x[] = {10, 6, -4, 23, 15};
			System.out.println("Array Before Sorting");			
			for(int n : x)
				System.out.print(n + "\t");
			
			Arrays.sort(x);
			
			System.out.println("\nArray After Sorting");			
			for(int n : x)
				System.out.print(n + "\t");
			
			
			char ch[] = {'c', 'x', 'a', 'n', 'b'};
			
			
			System.out.println("\nArray Before Sorting");			
			for(char n : ch)
				System.out.print(n + "\t");
			
			Arrays.sort(ch);
			
			System.out.println("\nArray After Sorting");			
			for(char n : ch)
				System.out.print(n + "\t");
	}

}
