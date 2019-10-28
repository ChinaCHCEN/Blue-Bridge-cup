package 蓝桥杯官网;
/**
 * 记录每一个数移动的次数，移动过2次就是1+2，三次就是1+2+3；
 * 将所有数的移动次数和相加。
 */
import java.util.Scanner;

public class 小朋友排队 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++)
		{
			arr[i] = sc.nextInt();
		}
		int temp = 0,sum = 0 , k = 1,d = 0;
		boolean th = true;
		while(th)
		{
		   for(int i = 0;i < n-1; i++)
		   {
		     if(arr[i] > arr[i+1])
		     {
//		k的值是数据移动的次数，sum的值为让数列从小到大排列总共移动了几次。
		    	sum += k;
		    	temp = arr[i];
		    	arr[i] = arr[i+1];
		    	arr[i+1] = temp;
		    	k++;
		     }
		   }
		   for(int i = 0;i < arr.length-1;i++)
		   {
			  if(arr[i] < arr[i+1])
			  {
				  d++;
				  if(d == arr.length-1)
				  {
					  th = false;
				  }
			  }	  
		   }
		}
		System.out.println(sum);
	}
}
