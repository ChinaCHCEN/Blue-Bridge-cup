package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_Tom�� {
	public static void main(String[] args)
	{
		int num = 0;
		Scanner sr = new Scanner(System.in);
		try
		{
		while(sr.hasNext())
		{
			//��char����ĸ���Ԫ����ӣ��ڼ�ȥ��0����char���ͣ���0������  48��int���ͣ�
			char[] n = sr.next().toCharArray();
			
			for(int i = 0; i<n.length;i++ )
			{
//				 num += n[i]-48;//������ȥ48��char���ͼ�ȥ��0��
				num += n[i]-'0';
			}

			System.out.println(num);
			num = 0;
		}
	}catch (Exception e) 
	 {
		System.out.println("no");
	 }
	}
}
