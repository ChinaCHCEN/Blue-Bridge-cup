package 蓝桥杯官网;
/** 1:
 * 	indexOf() 方法可返回某个指定的字符串值在字符串中首次出现的位置。
 * 	注释：indexOf() 方法对大小写敏感！
	注释：如果要检索的字符串值没有出现，则该方法返回 -1。
	
	2:
	toCharArray是将String对象的每一个下标位的对象保存在char[]中，
	比如：String a = "abcd"; char[] b = a.toCharArray(); 这个b保存的信息就是['a','b','c','d']。
 */
import java.util.Scanner;

public class 蓝桥杯考题_字母阵列 {
		static Scanner sc = new Scanner(System.in);
		static int[][] move = {{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},
								{1,-1},{0,-1}};
		static char[][] map = new char[100][100];
		static String LQ = "LANQIAO";
		static int cnt = 0;
		
		
		public static void main(String[] args)
		{
			for(int i = 0; i < 100; i++)
			{
//toCharArray是将String对象的每一个下标位的对象保存在char[]中，比如：String a = "abcd"; char[] b = a.toCharArray(); 这个b保存的信息就是['a','b','c','d']。
				map[i] = sc.next().toCharArray();
			}
			
			for(int i = 0;i < 100; i++)
			{
				for(int j = 0; j < 100; j++)
				{
//					为L时才搜索
					if(map[i][j] == 'L')
					{
//						8个方向,move.length等于8
						for(int j2 = 0; j2 < move.length; j2++)
						{
							int x = i;
							int y = j;
							String str = "L";
//							7个字符
							for(int k = 1; k < LQ.length(); k++)
							{
								x += move[j2][0];
								y += move[j2][1];
//							判断是否越界和是否是LANQIAO中的任意字符.	indexOf() 方法可返回某个指定的字符串值在字符串中首次出现的位置,如果要检索的字符串值没有出现，则该方法返回 -1。
								if(x < 0 || x>= 100||y<0||y>=0||LQ.indexOf(map[x][y]) == -1)
								{
									break;
								}
								str+= map[x][y];
							}
							if(str.equals(LQ)) {
								cnt++;
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}

