package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_�ֽ�������
   {
    public static void main(String [] args){
//	  Scanner input =new Scanner(System.in);
//	    int n=input.nextInt(),i,j,k;
//	    int m=input.nextInt();
//	    for(i=n;i<=m;i++)
//	    {             // ��n��m
//	     j = 1;
//	     k = i;       // ��ֵ����k���ı�i
//	    System.out.print(k+"=");           
//	     while(k!=1)
//	     {                      
//	    	j++;
//	        if(k%j==0)
//	       {           //�ҵ�һ�����ӣ��ͽ�ԭ������������ӡ��ٴ�ѭ����ֱ��kΪһ
//	    	k=k/j;
//	    	if(k == 1)
//	    	System.out.print(j);           //���û�г˺�
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
	      

