package ���ű�����;
/** 1:
 * 	indexOf() �����ɷ���ĳ��ָ�����ַ���ֵ���ַ������״γ��ֵ�λ�á�
 * 	ע�ͣ�indexOf() �����Դ�Сд���У�
	ע�ͣ����Ҫ�������ַ���ֵû�г��֣���÷������� -1��
	
	2:
	toCharArray�ǽ�String�����ÿһ���±�λ�Ķ��󱣴���char[]�У�
	���磺String a = "abcd"; char[] b = a.toCharArray(); ���b�������Ϣ����['a','b','c','d']��
 */
import java.util.Scanner;

public class ���ű�����_��ĸ���� {
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
//toCharArray�ǽ�String�����ÿһ���±�λ�Ķ��󱣴���char[]�У����磺String a = "abcd"; char[] b = a.toCharArray(); ���b�������Ϣ����['a','b','c','d']��
				map[i] = sc.next().toCharArray();
			}
			
			for(int i = 0;i < 100; i++)
			{
				for(int j = 0; j < 100; j++)
				{
//					ΪLʱ������
					if(map[i][j] == 'L')
					{
//						8������,move.length����8
						for(int j2 = 0; j2 < move.length; j2++)
						{
							int x = i;
							int y = j;
							String str = "L";
//							7���ַ�
							for(int k = 1; k < LQ.length(); k++)
							{
								x += move[j2][0];
								y += move[j2][1];
//							�ж��Ƿ�Խ����Ƿ���LANQIAO�е������ַ�.	indexOf() �����ɷ���ĳ��ָ�����ַ���ֵ���ַ������״γ��ֵ�λ��,���Ҫ�������ַ���ֵû�г��֣���÷������� -1��
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

