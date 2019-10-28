package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_±¨Ê±ÖúÊÖ {

	public static void main(String[] args)
	{
	   Scanner in = new Scanner(System.in);
	   int a = in.nextInt();
	   int b = in.nextInt();
	   String[] time = {"zero","one","two","three","four","five","six","seven","eight",
			   "nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen",
			   "seventeen","eighteen","nineteen","twenty","twenty one","twenty two","twenty three"};
	   String[] out = {"","","twenty","thirty","forty","fifty"};
	  if(b == 0)
	  {
		  System.out.print(time[a]+ " o'clock");
	  }else if(b>0&&b <=20)
	  {
		  System.out.print(time[a]+" "+time[b]);
	  }else {
		    System.out.print(time[a]+" "+out[b/10]+" "+time[b%10]);
		  }
	  }
   }

