package 蓝桥杯官网;

import java.util.Arrays;
import java.util.Scanner;

public class 蓝桥杯练习题_排队打水问题 {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		  int n=in.nextInt();
		  int a[]=new int[n];
		  int m=in.nextInt();
		  for(int i=0;i<n;i++)
		  {
		   a[i]=in.nextInt();	 //n个人打水的时间
		  }
		  Arrays.sort(a);
		  int j=0;
		  int temp[]=new int[m];
		  int sum=0;
		  
		  //i表示第几个水龙头,temp【i】表示当前这个人的打水等待时间
		  //最后一个人和前面第一个人不需要等待，总共m个人不需要等待
		  
		  while(j<n)		//n为人数，m为打水个数
		  {
		     for(int i=0;i<m&&j<n;i++,j++)//加上水龙头的个数加一
		     {
		    	 temp[i]+=a[j];//a[j]等于输入的打水时间的数组 n=3,m=2; 0 = 1;1 = 2;2 = 3;
		    	 sum+=temp[i];
		     }
		  }
		  System.out.println(sum);
    }
}
