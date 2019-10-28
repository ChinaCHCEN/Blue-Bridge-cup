package 蓝桥杯官网;

import java.util.Scanner;

public class 格子刷油漆 {
		private static int m;
		private static int step[][]=new int[][]{{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
		private static int[][] v=new int[2][1002];
		private static int mun=0;
		
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		m=input.nextInt();
		
		for (int i = 0; i <2; i++)
		{
		   for (int j = 0; j <m; j++)
		    {
			   v[i][j]=1;
			   dfs(0,i,j);
			   v[i][j]=0;
		    }
		}
			System.out.println(mun);
		}

private static void dfs(int count, int x, int y)
  {
		if(count==m*2-1) //每次count等于m*2-1时就相等于刷了一种方法了。
		{
			mun++;
			if(mun==1000000007)
				mun=0;
			return;
		}
		for(int i = 0; i < 8; i++)
		{
//			将8个方位的值都过一遍
			int x1=x+step[i][0];
			int y1=y+step[i][1];
//			如果x1小于0则纵坐标小于0，第一行还小，x1大于总共2行，大于1除外面了；y1大于等于m行坐标超过输入的m几列。
//			都是无意义的情况
			if(x1<0||y1<0||x1>1||y1>=m)
				continue;
			if(v[x1][y1]==0) //等于0相当于没刷
			{
				v[x1][y1]=1; //刷了
				dfs(count+1,x1,y1); //刷了的格子数，这一坐标上传。换下一个坐标
				v[x1][y1]=0;//只要dfs中的count数上传了，让下一个方位加下来就行了。
			}
		}
	}
}

