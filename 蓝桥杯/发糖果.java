package 蓝桥杯官网;

import java.util.Scanner;

public class 发糖果 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w[] = new int[n];
		int arr[] = new int[n];
		int t = 0;
		boolean th = true;
		for(int i = 0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
	while(th)
	{
//		从其他小朋友那获得的一半
		w[n-1] = arr[0]/2;
		for(int i = 0;i < n-1; i++)
		{
			w[i] = arr[i+1]/2;
		}
		
		for(int i = 0; i< n;i++)
		{
			arr[i] = arr[i]/2+w[i];
			if(arr[i]%2 != 0)
			{
				arr[i]++;
				t++;
			}
		}
		for(int i = 0; i<n-1; i++)
		{
			if(arr[i] != arr[i+1])
				break;
			if(i == n-2)
			  th = false;
		}
	}
	System.out.println(t);
  }
}
