package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_Ğ£ÃÅÍâµÄÊ÷ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int num = 0;
		int arr[] = new int[n+1];
		for(int i = 0; i < m;i++)
		{
			int a  = sc.nextInt();
			int b = sc.nextInt();
			for(int j = a;j <= b; j++)
			{
				arr[j] = 1;
			}
		}
		for(int j = 0; j <= n; j++)
		{
			if(arr[j]!=1) {
				num++;
			}
		}
		System.out.println(num);
    }
}
/*Scanner cin=new Scanner(System.in);
     int s=cin.nextInt();
     int n=cin.nextInt();
     int tree[]=new int[s+1];
     for(int i=0;i<n;i++){
         int a=cin.nextInt();
         int b=cin.nextInt();
         for(int j=a;j<=b;j++){
             tree[j]=1;
         }
     }
     int ss=0;
     for(int i=0;i<=s;i++){
         if(tree[i]!=1){
             ss++;
         }
     }
     System.out.println(ss);
     */
