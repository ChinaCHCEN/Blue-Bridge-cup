package ���ű�����;

import java.util.Arrays;
import java.util.Scanner;

public class ���ű���ϰ��_�ŶӴ�ˮ���� {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		  int n=in.nextInt();
		  int a[]=new int[n];
		  int m=in.nextInt();
		  for(int i=0;i<n;i++)
		  {
		   a[i]=in.nextInt();	 //n���˴�ˮ��ʱ��
		  }
		  Arrays.sort(a);
		  int j=0;
		  int temp[]=new int[m];
		  int sum=0;
		  
		  //i��ʾ�ڼ���ˮ��ͷ,temp��i����ʾ��ǰ����˵Ĵ�ˮ�ȴ�ʱ��
		  //���һ���˺�ǰ���һ���˲���Ҫ�ȴ����ܹ�m���˲���Ҫ�ȴ�
		  
		  while(j<n)		//nΪ������mΪ��ˮ����
		  {
		     for(int i=0;i<m&&j<n;i++,j++)//����ˮ��ͷ�ĸ�����һ
		     {
		    	 temp[i]+=a[j];//a[j]��������Ĵ�ˮʱ������� n=3,m=2; 0 = 1;1 = 2;2 = 3;
		    	 sum+=temp[i];
		     }
		  }
		  System.out.println(sum);
    }
}
