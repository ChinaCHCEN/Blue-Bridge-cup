package ���ű�����;

import java.util.Scanner;
/**
String���format()�������ڴ�����ʽ�����ַ����Լ����Ӷ���ַ�������
 ��ϤC���Ե�ͬѧӦ�üǵ�C���Ե�sprintf()����������������֮����format()����������������ʽ��
format(String format, Object... args) 
���ַ���ʹ�ñ������Ի������ƶ��ַ�����ʽ�Ͳ������ɸ�ʽ�������ַ�����
format(Locale locale, String format, Object... args)
 ʹ��ָ�������Ի������ƶ��ַ�����ʽ�Ͳ������ɸ�ʽ�����ַ�����
 *
 */
public class ���ű���ϰ��_������ʽ��ƽ����
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) 
		{
			double a = scanner.nextInt();
			double x, y=a;   
			for(int i=1;i>0;i++)
	           {
			       x = y;
			       y  = (x + a / x) / 2;
			       if(Math.abs(x-y)<1e-6) //1e-6����˼����1*10��-6�η�
			       break;
			   }
		System.out.printf(String.format("%.3f", y));
		}
	}	    
}

