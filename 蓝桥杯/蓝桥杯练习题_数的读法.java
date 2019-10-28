package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_数的读法 {
       public static void main(String[] args)
       {
    	  Scanner in = new Scanner(System.in);
    	  String digit[] = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
    	  while(in.hasNext()) 
    	  {
    	  String n = in.next();
    	  int cnt = n.length()%4;
    	  String tmp[] = {"0000","000","00","0"};
    	  n = tmp[cnt]+n;  	 //把输入的数字拼成4的整数倍长度
    	  String ans = "";
    	  int nzero = 0;   	 //记录连续0的个数
    	  for(int i =4-cnt;i<n.length();i++) {//4-cnt可定位到输入数字的第一位
    	      if(n.charAt(i) != '0') 
    	    {
    	   //遇到第一个非零数字，且有多个连续的0，且非零数字不在下一组的第一个位置，只需读出一个0
    	      if(nzero>0 && i%4 != 0)
    	          ans += "ling ";
    	          nzero = 0;
    	      if(i%4==0)  //千位
    	          ans += digit[n.charAt(i)-'0'] + " qian ";
    	      else if(i%4==1) //百位
    	          ans += digit[n.charAt(i)-'0'] + " bai ";
    	      else if(i%4==2) //十位
    	          ans += digit[n.charAt(i)-'0'] + " shi ";
    	      else    //个位
    	          ans += digit[n.charAt(i)-'0'] + " ";
    	     }
    	      else
    	             nzero++;
    	      if(n.length() - i == 5 && nzero < 4) //如果位于万位上且这一组的四个数字不全为0,需要加“wan”
    	             ans += "wan ";
    	      else if(n.length() - i == 9) //如果位于亿位上，需要加“yi”
    	             ans += "yi ";
    	               }
    	      if(ans.indexOf("yi shi") == 0)   //"yi shi"开头的话要去掉"yi "
    	             ans = ans.substring(3,ans.length());
    	      System.out.println(ans);
    	           }
    	           in.close();
    	       }
}

