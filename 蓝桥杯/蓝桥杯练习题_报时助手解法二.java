package 蓝桥杯官网;

import java.util.HashMap;
import java.util.Scanner;

public class 蓝桥杯练习题_报时助手解法二 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		HashMap<Integer,String> map = new HashMap<>();
		String[] time = {"zero","one","two","three","four","five","six","seven","eight",
				   "nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
				   "seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three"};
		   for(int i = 0;i<= 23;i++)  
			   map.put(i, time[i]);
			   map.put(30, "thirty");
			   map.put(40, "forty");
			   map.put(50, "fifty");
		while(in.hasNext())
		{
			int h = in.nextInt();	//小时最多23
			int m = in.nextInt();	//分钟最多60
			String ans = "";
			if(m == 0)
			{
			   ans = map.get(h)+" o'clock";
			}else if( m> 0 && m<=20 ||m%10 == 0)	
			{
			   ans = map.get(h)+" "+map.get(m);
			}else{
				ans  = map.get(h)+" "+map.get(m/10*10)+" "+map.get(m%10);
			}
			System.out.println(ans);
		}
		in.close();
	
	}
}
