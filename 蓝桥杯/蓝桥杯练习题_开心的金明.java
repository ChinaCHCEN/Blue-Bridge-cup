package ���ű�����;

import java.util.Scanner;
public class ���ű���ϰ��_���ĵĽ��� {
	
static int m;
static int max = 0;
static int money[];
static int value[];

 public static void main(String[] args)
 {
	 
    Scanner in=new Scanner(System.in);
 	int n=in.nextInt();//��Ǯ����
 	m=in.nextInt();//��Ʒ����
 	money=new int[m];
 	value=new int[m];
 	for(int i=0;i<m;i++) //m��Ʒ����
 	{
 		money[i]=in.nextInt();	//ÿһ������
 		value[i]=in.nextInt();
 	}
 		dfs(n,0,0);
 		System.out.println(max);
 	}
private static void dfs(int n, int sum,int i) {
	if(sum>max)
	{
		max=sum;
	}
	for(i=i;i<m;i++) //mΪ��Ʒ������i��0��ʼ
	{
		if(n>=money[i])
		{
			System.out.println(n+" "+i);
//			Ǯ��ȥmoney[0]��Ǯ�� sum + �۸���Թ��س̶ȡ� i+1����һ��
			dfs( n-money[i], sum+money[i]*value[i], i+1); 
		}
	}
  }
}
