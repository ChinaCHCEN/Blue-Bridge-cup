package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_���ǹ� {
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
			w[n-1] = a[0]/2;//���һ���˵�����ǵ�һ����
			for(int i = 1; i < n;i++)
				w[i-1] = a[i]/2;	//w[i-1]��ʾ���ֱߵ��ˣ�����w[i]���˽�һ��ָ���
			for(int i = 0;i < n;i++) 
			{	//a[k]���ǹ�����Ϊ = ����һ�� + ��һ�����ģ�
			    a[i] = a[i]/2+w[i];
			    if(a[i]%2 != 0)	 		//�����Ϊ����  a[k]��������һ����ʦ��һ����
			    {
			    	a[i]++;
			    	num++;
			    }
			}
			for(int i = 0;i < n-1;i++)
			{
				if(a[i] != a[i+1])
					break;
				if(i == n-2)//���iִ�е�n-2�����Ƕ���ȵ��Ǿ���ͣ���
				  b = false;
			}
		}
		System.out.println(num);
	}
}


/*
public class ���ű���ϰ��_���ǹ�
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
			wee[a-1]=arr[0]/2;	//��һ���˽�����1/2�����һ����
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
