package ���ű�����;
/**
 * ��¼ÿһ�����ƶ��Ĵ������ƶ���2�ξ���1+2�����ξ���1+2+3��
 * �����������ƶ���������ӡ�
 */
import java.util.Scanner;

public class С�����Ŷ� {
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
//		k��ֵ�������ƶ��Ĵ�����sum��ֵΪ�����д�С���������ܹ��ƶ��˼��Ρ�
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
