package ���ű�����;
/**
 *next()��nextLine()���������
 *next()�����ڶ�ȡ����ʱ������˵���Ч�ַ�ǰ�����Ч�ַ�����������Ч�ַ�֮ǰ�����Ŀո����
 *Tab����Enter���Ƚ�������next()�������Զ�������˵���ֻ���ڶ�ȡ����Ч�ַ�֮��
 *next()�����Ž����Ŀո����Tab����Enter������Ϊ������������next()�������ܵõ����ո���ַ�����
 */
 
/*nextLine()������������ɨ��һ���е���˼�����Ľ�����ֻ����Enter������nextLine()
 * �������ص���Enter��֮ǰû�б���ȡ�������ַ������ǿ��Եõ����ո���ַ����ġ�
 */

import java.util.Scanner;

public class ���ű���ϰ��_�ַ����Ա� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.length() != b.length())	//���Ȳ�������1
		{
			System.out.println(1);
		}
		else if(a.length() == b.length())
		{
			if(a.equals(b))	//������ȣ����ִ�Сд ������2
			{
				System.out.println(2);
			}else {
				if(a.equalsIgnoreCase(b)) //������ȣ������ִ�Сд������3
				{
					System.out.println(3);
				}else {
					System.out.println(4); //������ȣ������ִ�Сд��������4
				}
			}
		}
	}
}
