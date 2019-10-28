package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_用筛法求N之内的素数 {
public static void main(String[] args) 
	{
	Scanner in = new Scanner(System.in);
	int t = in.nextInt();
	   int[] a = getPrimes(t);
	   for (int i = 0; i < a.length; i ++)
	   {
	       System.out.println(a[i]);
	   }
	    System.out.println();
	}

private static int[] getPrimes(int n) 
  {
	int[] a = new int[n];
    for(int i = 2; i < n; i ++) 
    {
        a[i] = i;
    }
    // 筛法
    for(int i = 2; i < n; i ++)
    {
        if (a[i] != 0) 
        {
           for(int j = i * 2; j < n; j = j + i) 
           {
                 a[j] = 0;
           }
        }
    }
    int count = 0;
    for(int i = 2; i < n; i++)
    {
        if (a[i] != 0)
        {
            count ++;
        }
    }
    if (count > 0)
    {
        int[] primes  = new int[count];
        int j = 0;
        for (int i = 2; i < n; i ++) 
        {
            if(a[i] != 0) 
            {
                primes[j] = a[i];
                j ++;
            }
        }
        return primes;
    }
    return null;
  }
}




	


