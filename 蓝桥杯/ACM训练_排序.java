package À¶ÇÅ±­¹ÙÍø;

import java.util.Arrays;
import java.util.Scanner;

public class ACMÑµÁ·_ÅÅĞò {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		for(int i = 0; i<4;i++)
		{
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i = 0; i< 4;i++)
		{
			for(int j = 0; j< 4;j++)
			{
				for(int k = 0; k< 4;k++)
				{
					if(i!=j&&i!=k&&j!=k)
					{
					System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
					System.out.println();
					}
				}
			}
		}
	}
}		
		/*
	    Scanner cin=new Scanner(System.in);
	    int a[]=new int [4];
	     for(int i=0;i<4;i++)
	     {
	      a[i]=cin.nextInt();
	      }
	        Arrays.sort(a);
	    for(int n=3;n>=0;n--)
	        for(int i=0;i<4;i++)
	        {
	            if(n==i)
	            	continue;
	            for(int j=0;j<4;j++)
	            {
	                if(i==j||n==j)
	                	continue;
	                for(int k=0;k<4;k++)
	                {
	                    if(i==k||j==k||n==k) 
	                    	continue;
	                    System.out.println(a[i]+" "+a[j]+" "+a[k]);
	                }
	            }
	        }
	    }
	}*/

