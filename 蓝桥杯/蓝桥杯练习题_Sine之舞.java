package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_Sine֮�� {
	public static void main(String[] args)
	{
	  Scanner input =new Scanner(System.in);
	  int n=input.nextInt(),i,j;
	  String str1=" ";
	  for(i=1;i<n;i++)
	  {     //Sn��ǰ�������
	 str1+="(";
	  }
	  for(j=n;j>=1;j--)
	  {      //����
	  char k='+';               //�Ӽ�����
	  String str="";
	for(i=1;i<n-j+2;i++)
	{            //An�����岿��
	if(i%2==0)
		k='-';
	else 
		k='+';
	str+=k+"sin("+i;            //����ţ�i��һ
	}
	for(i=1;i<=n-j+1;i++)
	{      //An���������
	str+=")";
	}
	if(j==1)             //Sn�����û������
	str1+=str+"+"+j;
	else
	str1+=str+"+"+j+")";
	  }
	  System.out.println(str1);
   }
}
	

