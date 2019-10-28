package À¶ÇÅ±­¹ÙÍø;

import java.util.Scanner;

public class À¶ÇÅ±­¿¼Ìâ_±ù±¢Êı {
		public static void main(String[] args)
		{
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			int t = 1;
			for(int i = 1;i<a;i++)
			{
				int max = fun(i,i);
				if(max > t)
				 t = max;
			}		
			System.out.println(t);
		}
		private static int fun(int n,int max)
		{
		   if(n == 1)
		   {
			      return max;
		   }else 
			   if(n%2 == 0){	 //Å¼Êı
			      n = n/2;
			      if(n>max)
			    	  max = n;
			      return fun(n,max);
			}else{				 //ÆæÊı
				n = n*3+1;
				if(n>max)
					  max = n;
				  return fun(n,max);   
		    }		
		}
	}
