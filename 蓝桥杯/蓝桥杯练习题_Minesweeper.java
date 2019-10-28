package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_Minesweeper {
	
	public static void main(String[] args)
	{
	    Scanner cin=new Scanner(System.in);
        int num=1;
        while(cin.hasNext()){
            int a=cin.nextInt();
            int b=cin.nextInt();
            if(a==0&&b==0)
            	break;
            String []n=new String[a];
            for(int i=0;i<a;i++)
            {
               n[i]=cin.next();
            }
            System.out.println("Field #"+num+":");
            for(int i=0;i<a;i++)
            {
                for(int j=0;j<b;j++)
                {
                    int s=0;
                    if(n[i].charAt(j)=='*')
             // 找到指定字符串中位置的字符
                    	System.out.print(n[i].charAt(j));
                    else 
                    {
                        if(i!=0&&n[i-1].charAt(j)=='*')  s++;	//正上方
                        if(i!=0&&j!=0&&n[i-1].charAt(j-1)=='*') s++; //左上方
                        if(i!=0&&j!=b-1&&n[i-1].charAt(j+1)=='*') s++;//右上方
                        if(j!=0&&n[i].charAt(j-1)=='*') s++;//左边
                        if(j!=b-1&&n[i].charAt(j+1)=='*') s++;//右边
                        if(i!=a-1&&n[i+1].charAt(j)=='*') s++;//正下方
                        if(j!=0&&i!=a-1&&n[i+1].charAt(j-1)=='*') s++;//左下角
                        if(j!=b-1&&i!=a-1&&n[i+1].charAt(j+1)=='*') s++;//右下角
                        System.out.print(s);
                    }
                }
                System.out.println();
            }
            System.out.println();
            num++;
        }
	}
}
