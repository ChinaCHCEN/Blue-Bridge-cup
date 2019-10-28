package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_DNA {
	public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    int k,front,flag,after,row;
	    for (int i = 0;i < N; i++){
	        int a = in.nextInt();
	        int b = in.nextInt();
	        front = 0;
	        flag = 1;
	        row = a + (a-1)*(b-1);                //一共有多少行，表示行数。
	        after = a - 2;                        //最多空个数，表示空数。
	        for(int j = 0; j < row; j++)
	        {
	            for(int m = 0;m < front; m++)     //打印开头的空格
	                System.out.print(" ");
	            System.out.print("X");
	            // 进入了这个判断，就说明，该上下倒置了
	            // flag > 0   说明是输出正金字塔   小于 0  就是输出负金字塔
	            if(front == a/2 || (front == 0&&j > 0))
	            {
	                flag = -flag;
	                if(flag < 0)
	                {
	                    front--;	//空格数
	                    after = 1;	
	                }else
	                {
	                    after = a - 2;
	                    front++;
	                }
	                //这句话就是判断，当前行，是否是 之需要打印一个 X，如果是就换行，然后 结束当层循环
	                if(((front+1) == a/2 && after == 1) || ((front-1) == a/2 && after == a-2  ) )
	                {
	                    System.out.println();
	                    continue;
	                }
	            }
	            else {
	                if (flag > 0)
	                    front++;
	                else
	                    front--;
	            }
	            for (k = 0;k < after; k++)            //打印中间的空格
	                System.out.print(" ");
	            System.out.println("X");
	            if(flag > 0)
	                after = after - 2;
	            else
	                after = after + 2;
	        }
	        // 当前一次结束后，换行   这是格式要求
	        System.out.println();
	    }
	}
}
