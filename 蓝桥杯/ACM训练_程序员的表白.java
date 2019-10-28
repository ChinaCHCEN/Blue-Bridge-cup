package 蓝桥杯官网;

import java.util.Scanner;

public class ACM训练_程序员的表白 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    while(sc.hasNextInt())
	    {
	    	int n = sc.nextInt();
	    	for(int i = 0;i< n;i++)
			{
				System.out.print("*");
				for(int j = 0; j<n;j++)
				{
				System.out.print(" ");
				}
				System.out.println("*");
			
			}
			for(int k = 0; k < n+2;k++)
			{
			System.out.print("*");
			}
			System.out.println("\n");		
		}
	 }
}

/*
Scanner in = new Scanner(System.in);
while(in.hasNext()) {
int a = in.nextInt();
//行
for(int i=0;i<a;i++) {
for(int j=0;j<a+2;j++) {
if(j==0 || j==a+1) {
System.out.print("*");
}
else {
System.out.print(" ");
}
}

System.out.println();
}
for(int k=0;k<a+2;k++) {
System.out.print("*");
}
System.out.println("\n");
}
}
}
*/
