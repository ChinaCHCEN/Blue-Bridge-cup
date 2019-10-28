package 蓝桥杯官网;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 蓝桥杯练习题_幸运数 
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
    }//偶数就不用添加了
  int j=2;//第二个幸运数
  while(num.get(j-1)<=num.size())
  {
      int number=num.get(j-1);//幸运数
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
//Java String.contains()方法，当且仅当此字符串包含指定的char值序列时，返回true。
  if(num.contains(m))
	  temp--;
  System.out.println(temp); 
     }
  }
