package ���ű�����;
/**
 * ������Ҫ�Ĳ���
 * 1: sum += a[i]-'0';	
 *    �����������ַ������ͣ�Ȼ��ת��Ϊchar���͡���ӵ�ʱ����Ҫ -��0��������衣
 * 2: a = String.valueOf(sum).toCharArray();
 *     ��֮ǰ��ӵ�����sum�����¸�ֵ������a��valueOf()�����ǽ�int���͵�sumת��λString���͡��ٽ������ֿ���char����a��
 *     	
 */
import java.util.Scanner;

public class ���ű�����_��λ��� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		while(true)
		{
			int sum = 0;
			for(int i = 0;i < a.length; i++)
			{
				sum += a[i]-'0';		
			}
			a = String.valueOf(sum).toCharArray();
			if(a.length == 1) {
				System.out.println(a);
				break;
			}
		}
	}
}
