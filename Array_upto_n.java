import java.util.*;
public class Array_upto_n
 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size :");
		int n = s.nextInt();
		int a[] = new int[n];
		
		System.out.println("Enter "+n +"Values :");
		for(int i = 0; i<n; i++)
		{
			a[i] =s.nextInt();
		}
		for(int i =0; i<n; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(a[i]);
			}
		}
	   
	}

}