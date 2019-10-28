package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_分糖果 {
	private static int num = 0;
	public static void main(String[] args)
	{
		Scanner sr = new Scanner(System.in);
		int n = sr.nextInt();
		int[] a = new int[n];
		int[] w = new int[n];
 		for(int i = 0;i < n; i++)
		{
			a[i] = sr.nextInt();
		}
 	      boolean b = true;
		while(b)
		{
			w[n-1] = a[0]/2;//最后一个人的左边是第一个人
			for(int i = 1; i < n;i++)
				w[i-1] = a[i]/2;	//w[i-1]表示左手边的人，等于w[i]的人将一半分给它
			for(int i = 0;i < n;i++) 
			{	//a[k]的糖果数量为 = 分走一半 + 上一个给的；
			    a[i] = a[i]/2+w[i];
			    if(a[i]%2 != 0)	 		//如果它为奇数  a[k]的数量加一，老师补一个。
			    {
			    	a[i]++;
			    	num++;
			    }
			}
			for(int i = 0;i < n-1;i++)
			{
				if(a[i] != a[i+1])
					break;
				if(i == n-2)//如果i执行到n-2。还是都相等的那就暂停输出
				  b = false;
			}
		}
		System.out.println(num);
	}
}


/*
public class 蓝桥杯练习题_分糖果
{
	public static void main (String[]args)
	{
		Scanner db=new Scanner (System.in);
		int a=db.nextInt();
		int arr[]=new int [a];
		int wee[]=new int [a];
		int cou=0; 
		for(int i=0; i<a; i++)
			arr[i]=db.nextInt();
		boolean b=true;
		while(b)
		{
			wee[a-1]=arr[0]/2;	//第一个人将他的1/2给最后一个人
			for(int i=1; i<a; i++)
				wee[i-1]=arr[i]/2;
			for(int i=0; i<a; i++)
			{
				arr[i] = arr[i]/2 + wee[i];
				if(arr[i]%2!=0)
				{
					arr[i]++;
					cou++;
				}
			}
			for(int i=0; i<a-1; i++)
			{
				if(arr[i]!=arr[i+1])
					break;
				if(i==a-2)
					b=false;
			}
		}
		 System.out.println(cou);

	}

}
*/
