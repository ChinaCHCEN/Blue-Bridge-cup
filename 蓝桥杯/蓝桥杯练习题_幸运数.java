package ���ű�����;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ���ű���ϰ��_������ 
{
	public static void main(String[] args) 
	{
	Scanner in=new Scanner(System.in);
  	int n=in.nextInt();
  	int m=in.nextInt();
    ArrayList<Integer> num = new ArrayList<Integer>();  
    for(int i=1;i<m;i+=2)
    {
   num.add(i);
    }//ż���Ͳ��������
  int j=2;//�ڶ���������
  while(num.get(j-1)<=num.size())
  {
      int number=num.get(j-1);//������
      System.out.println(number);
      for(int i=number-1;i<num.size();i=i+number-1)
      {
         num.remove(i);
      }
  j++;
  }
  int temp=num.size();
  for(int i=0;i<num.size();i++)
  {
   if(num.get(i)<=n)
	  temp--;
  }
//Java String.contains()���������ҽ������ַ�������ָ����charֵ����ʱ������true��
  if(num.contains(m))
	  temp--;
  System.out.println(temp); 
     }
  }
