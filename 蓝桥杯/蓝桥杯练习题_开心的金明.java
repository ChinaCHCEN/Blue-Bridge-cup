package 蓝桥杯官网;

import java.util.Scanner;
public class 蓝桥杯练习题_开心的金明 {
	
static int m;
static int max = 0;
static int money[];
static int value[];

 public static void main(String[] args)
 {
	 
    Scanner in=new Scanner(System.in);
 	int n=in.nextInt();//金钱总数
 	m=in.nextInt();//物品总数
 	money=new int[m];
 	value=new int[m];
 	for(int i=0;i<m;i++) //m物品总数
 	{
 		money[i]=in.nextInt();	//每一组数组
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
	for(i=i;i<m;i++) //m为物品总数，i从0开始
	{
		if(n>=money[i])
		{
			System.out.println(n+" "+i);
//			钱减去money[0]的钱， sum + 价格乘以贵重程度。 i+1到下一组
			dfs( n-money[i], sum+money[i]*value[i], i+1); 
		}
	}
  }
}
