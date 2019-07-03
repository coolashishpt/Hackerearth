package basic;

import java.util.Scanner;

public class ProductArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		int[] array=new int[n];
		
		int product = 1;
		
		for(int i=0;i<n;i++)
		{
			array[i]=s.nextInt();
		}
				
		for(int i=0;i<n;i++)
		{
			
			product=product*array[i];
		}		
		
		System.out.print(product);
				
		
		s.close();
}

}
