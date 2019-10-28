package 蓝桥杯官网;
/**
 * 题中的意思是先取一段，再排序。
 */
import java.util.Scanner;

public class 蓝桥杯练习题_区间K大数查询 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] F = new int[n];
		for(int i = 0; i < n; i++)
		{
			F[i] = in.nextInt();
		}
//		先将给定序列从小到大排列
		
		
		int m = in.nextInt();
		for(int i = 0; i< m ;i++)
		{
		 int h = 0;

			int a1 = in.nextInt();
			int a2 = in.nextInt();
			int a3 = in.nextInt();
			
			int[] G = new int[a2-a1+1];
			for(int j = a1-1; j <= a2-1; j++,h++)
			{
			    G[h] = F[j];
			    
			}
			for(int a = 0; a < h-1; a ++)
			{
				for(int b = 0; b < h-a-1; b++)
				{
					if(G[b+1] < G[b] )
					{
						int test = G[b+1];
						G[b+1] = G[b];
						G[b] = test;
					}
				}
			}
			System.out.println(G[h-a3]);
		}
	}
	}

/*
 * 
import java.util.*;

class Main

{

	public static void main(String[] args)

	{

		Scanner sc=new Scanner(System.in);

		int temp;

		//第一部分：输入序列的长度及序列

		int n=sc.nextInt();

		int[] a=new int[n];

		for(int i=0;i<n;i++)

			a[i]=sc.nextInt();

		//第二部分：输入查询的个数m,区间范围（l，r）,以及k的值

		int m=sc.nextInt();

		for(int i=0;i<m;i++)

		{

			int l=sc.nextInt();

			int r=sc.nextInt();

			int k=sc.nextInt();

			//第三部分：将l到r这个区间范围的值放入到数组b中

			int[] b=new int[r-l+1];

			int e=0;

			for(int j=l-1;j<=r-1;j++)

			{

				b[e++]=a[j];

			}

			//第四部分：将数组b进行排序,并按要求输出

			for(int q=0;q<b.length;q++)

			{

				for(int w=q+1;w<b.length;w++)

				{

					if(b[q]<b[w])

					{

						temp=b[w];

						b[w]=b[q];

						b[q]=temp;

					}

				}

			}

			System.out.println(b[k-1]);

		}

	}

}
*/
 

