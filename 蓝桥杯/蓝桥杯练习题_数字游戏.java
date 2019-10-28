package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_Êý×ÖÓÎÏ· {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n,k,t,d=0,b = 1,num = 0;
		n = sc.nextLong();
		k = sc.nextLong();
		t  =sc.nextLong();
		
		long[] c = new long[50];
		long[] a = new long[50];
		if(t == 1)
		{
			System.out.println(1);
		}
		for(int i = 0;i < 50; i++)
		{
			a[i] = b;
			d++;
			b += d;
			if(b > k-1)
			{
				b = b-k;
			}
		}
		for(int j = 1; j < t; j++)
		{
			c[j] = a[(int) (j * n)];
			num  += c[j];
		}
		System.out.println(num+1);
	}
}

/*
import java.util.Scanner;
public class Main {
public static void main(String [] args) {
Scanner scan=new Scanner(System.in);
int i = 1;
long sum = 1,x, add = 1, n, k, T;
n=scan.nextLong();
k=scan.nextLong();
T=scan.nextLong();
while (i<T){
  x = add + ((i - 1)*n + 1 + i*n)*n / 2;
  i++;
  x = x%k;
  sum += x;
  add = x;
}
System.out.print(sum);
}
}
*/
