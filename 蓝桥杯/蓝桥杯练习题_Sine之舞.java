package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_Sine之舞 {
	public static void main(String[] args)
	{
	  Scanner input =new Scanner(System.in);
	  int n=input.nextInt(),i,j;
	  String str1=" ";
	  for(i=1;i<n;i++)
	  {     //Sn最前面的括号
	 str1+="(";
	  }
	  for(j=n;j>=1;j--)
	  {      //倒序
	  char k='+';               //加减控制
	  String str="";
	for(i=1;i<n-j+2;i++)
	{            //An的主体部分
	if(i%2==0)
		k='-';
	else 
		k='+';
	str+=k+"sin("+i;            //变符号，i加一
	}
	for(i=1;i<=n-j+1;i++)
	{      //An后面的括号
	str+=")";
	}
	if(j==1)             //Sn的最后没有括号
	str1+=str+"+"+j;
	else
	str1+=str+"+"+j+")";
	  }
	  System.out.println(str1);
   }
}
	

