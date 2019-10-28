package 蓝桥杯官网;
/**
 * 字符串之间要比较只能用equals()方法。不能用 ==。
 */
import java.util.Scanner;

public class 蓝桥杯考题_兰顿蚂蚁 {
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   int m = sc.nextInt();
	   int n = sc.nextInt();
	   int[][] arr = new int[m][n];
	   for(int i = 0;i < m; i++)
	   {
		   for(int j = 0; j < n; j++)
		   {
			   arr[i][j] = sc.nextInt();
		   }
	   }
	   int x = sc.nextInt();
	   int y = sc.nextInt();
	   String s = sc.next();
	   int k = sc.nextInt();
	   
	   while(k > 0)
	   {
		   if(arr[x][y] == 0)
		   {
			   s = left(s);
			   arr[x][y] = 1;
			   if(s.equals("U"))
			   {
				   x-=1;
			   }else if(s.equals("R"))
			   {
				   y+=1;
			   }else if(s.equals("L"))
			   {
				   y-=1;
			   }else if(s.equals("D"))
			   {
				   x+=1;
			   }
		   }else
		   {
			   s = right(s);
			   arr[x][y] = 0;
			   if(s.equals("U"))
			   {
				   x-=1;
			   }else if(s.equals("R"))
			   {
				   y+=1;
			   }else if(s.equals("L"))
			   {
				   y-=1;
			   }else if(s.equals("D"))
			   {
				   x+=1;
			   }
		   }
		   k--;
	  }
	   System.out.println(x+" "+y);
}

	private static String right(String s) 
	{
		if(s.equals("L"))
		{
			return "U";
		}else if(s.equals("U"))
		{
			return "R";
		}else if(s.equals("R"))
		{
			return "D";
		}else {
			return "L";
		}
	}

	private static String left(String s) {
		if(s.equals("L"))
		{
			return "D";
		}else if(s.equals("U"))
		{
			return "L";
		}else if(s.equals("R"))
		{
			return "U";
		}else {
			return "R";
		}
	}
}
