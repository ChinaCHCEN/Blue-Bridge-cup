package À¶ÇÅ±­¹ÙÍø;

import java.util.Arrays;
import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_Âò²»µ½µÄÊıÄ¿ {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		 int max=a>b?a:b;
         long array[]=new long[9999999];

//         Arrays.fill(array,0);
         array[a]=1;
         array[b]=1;

          int number=0;
          int count=0;
         for(int k=1;k<array.length;k++)
             {
                  if(array[k]==0)
                      {
                       number=k;
                       count=0;
                      }
                  else
                  {
                       array[k+a]=1;
                       array[k+b]=1;
                       count++;
                  }
          if(count==max)
               break;
                 }
         System.out.println(number);
     }
  }