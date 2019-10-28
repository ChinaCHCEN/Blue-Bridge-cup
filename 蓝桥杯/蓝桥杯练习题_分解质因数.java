package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_分解质因数
   {
    public static void main(String [] args){
//	  Scanner input =new Scanner(System.in);
//	    int n=input.nextInt(),i,j,k;
//	    int m=input.nextInt();
//	    for(i=n;i<=m;i++)
//	    {             // 从n到m
//	     j = 1;
//	     k = i;       // 将值赋给k不改变i
//	    System.out.print(k+"=");           
//	     while(k!=1)
//	     {                      
//	    	j++;
//	        if(k%j==0)
//	       {           //找到一个因子，就将原数除以这个因子。再次循环，直到k为一
//	    	k=k/j;
//	    	if(k == 1)
//	    	System.out.print(j);           //最后没有乘号
//	    	else
//	        System.out.print(j+"*");
//	    	j=1;
//	       }
//	     }
//	    	System.out.println();
//	     }
    	
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int m = in.nextInt();
    	for(int i = n;i <= m ;i++)
    	{
    		System.out.print(i+"=");
    		int j = 1;
    		int k = i;
    		while(k != 1)
    		{
    			j++;
    		   if(k % j == 0)
    		   {	   
    			   k = k/j;
    			   if(k == 1)
    				   System.out.print(j);
    			   else
    				   System.out.print(j+"*");
    			   j = 1;
    			  
    		   }
    		}
    		System.out.println();
    	}
    }
}
	      

