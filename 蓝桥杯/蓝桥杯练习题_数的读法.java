package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_���Ķ��� {
       public static void main(String[] args)
       {
    	  Scanner in = new Scanner(System.in);
    	  String digit[] = {"ling","yi","er","san","si","wu","liu","qi","ba","jiu"};
    	  while(in.hasNext()) 
    	  {
    	  String n = in.next();
    	  int cnt = n.length()%4;
    	  String tmp[] = {"0000","000","00","0"};
    	  n = tmp[cnt]+n;  	 //�����������ƴ��4������������
    	  String ans = "";
    	  int nzero = 0;   	 //��¼����0�ĸ���
    	  for(int i =4-cnt;i<n.length();i++) {//4-cnt�ɶ�λ���������ֵĵ�һλ
    	      if(n.charAt(i) != '0') 
    	    {
    	   //������һ���������֣����ж��������0���ҷ������ֲ�����һ��ĵ�һ��λ�ã�ֻ�����һ��0
    	      if(nzero>0 && i%4 != 0)
    	          ans += "ling ";
    	          nzero = 0;
    	      if(i%4==0)  //ǧλ
    	          ans += digit[n.charAt(i)-'0'] + " qian ";
    	      else if(i%4==1) //��λ
    	          ans += digit[n.charAt(i)-'0'] + " bai ";
    	      else if(i%4==2) //ʮλ
    	          ans += digit[n.charAt(i)-'0'] + " shi ";
    	      else    //��λ
    	          ans += digit[n.charAt(i)-'0'] + " ";
    	     }
    	      else
    	             nzero++;
    	      if(n.length() - i == 5 && nzero < 4) //���λ����λ������һ����ĸ����ֲ�ȫΪ0,��Ҫ�ӡ�wan��
    	             ans += "wan ";
    	      else if(n.length() - i == 9) //���λ����λ�ϣ���Ҫ�ӡ�yi��
    	             ans += "yi ";
    	               }
    	      if(ans.indexOf("yi shi") == 0)   //"yi shi"��ͷ�Ļ�Ҫȥ��"yi "
    	             ans = ans.substring(3,ans.length());
    	      System.out.println(ans);
    	           }
    	           in.close();
    	       }
}

