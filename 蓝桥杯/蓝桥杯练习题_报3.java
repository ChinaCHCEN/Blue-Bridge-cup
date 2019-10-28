package À¶ÇÅ±­¹ÙÍø;

import java.util.ArrayList;
import java.util.Scanner;

public class À¶ÇÅ±­Á·Ï°Ìâ_±¨3 {
	public static void main(String[] args)
	{
		        Scanner sc=new Scanner(System.in);
		        int n=sc.nextInt();
		        ArrayList list=new ArrayList();
		        for(int i=1;i<=n;i++)
		        {
		            list.add(i);
		        }
		        int count=1;
		        int index=0;
		        while(list.size()!=1)
		        {  
		            if(index==list.size())
		            {
		                index=0;
		            }
		            if(count%3==0)
		            {
		                list.remove(index);
		                index--;
		            }           
		            count++;
		            index++;
		        }
		        System.out.println(list.get(0));
		   }	
}

