package ���ű�����;

import java.util.Scanner;

public class ACMѵ��_����Ա�ı�� {
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
//��
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
