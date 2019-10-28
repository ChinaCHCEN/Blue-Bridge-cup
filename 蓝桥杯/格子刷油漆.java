package ���ű�����;

import java.util.Scanner;

public class ����ˢ���� {
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
		if(count==m*2-1) //ÿ��count����m*2-1ʱ�������ˢ��һ�ַ����ˡ�
		{
			mun++;
			if(mun==1000000007)
				mun=0;
			return;
		}
		for(int i = 0; i < 8; i++)
		{
//			��8����λ��ֵ����һ��
			int x1=x+step[i][0];
			int y1=y+step[i][1];
//			���x1С��0��������С��0����һ�л�С��x1�����ܹ�2�У�����1�������ˣ�y1���ڵ���m�����곬�������m���С�
//			��������������
			if(x1<0||y1<0||x1>1||y1>=m)
				continue;
			if(v[x1][y1]==0) //����0�൱��ûˢ
			{
				v[x1][y1]=1; //ˢ��
				dfs(count+1,x1,y1); //ˢ�˵ĸ���������һ�����ϴ�������һ������
				v[x1][y1]=0;//ֻҪdfs�е�count���ϴ��ˣ�����һ����λ�����������ˡ�
			}
		}
	}
}

