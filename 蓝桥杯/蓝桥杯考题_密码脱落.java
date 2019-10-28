package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­¿¼Ìâ_ÃÜÂëÍÑÂä {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		char[] a = input.nextLine().toCharArray();
		code(a);
	}
	private static void code(char[] a) {
		int num = 0;
		int i = 0,n = 0,m = 0;
		int j = a.length-1;
		while(i<=j)
		{
			n = 0;
			m = 0;
			if(a[i] == a[j])
			{
				i++;
				j--;
			}else {
				int tj = j;
				while(a[i]!=a[tj])
				{
					tj--;
					n++;
				}
				int ti = i;
				while(a[ti]!=a[j])
				{
					ti++;
					m++;
				}
				if(n<m)
				{
					j-=n;
				}else {
					i+=m;
				}
				num += n<m?n:m;
			}
		}
		System.out.println(num);
		
	}
	
}
