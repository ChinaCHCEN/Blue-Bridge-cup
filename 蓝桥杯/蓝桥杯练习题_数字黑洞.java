package ���ű�����;
/**
 * ʹ�� String.valueOf() ��������ת���������ת��������Ϊ null, �����ַ���������һ�� "null" �ַ�����
   String�� ��������ת��ʱ�������ת��������Ϊ null, �򷵻� null ���������һ�� "null" �ַ�����
 */
import java.util.Arrays;
import java.util.Scanner;

public class ���ű���ϰ��_���ֺڶ� {
	public static void main(String[] args)
	{
	        Scanner sc = new Scanner(System.in);
	        while (sc.hasNext())
	        {
	          int n = sc.nextInt();
		      int count = 1;
		      int k = n;
		      while((k = F(k)) != 6174)
		      	{
		          count++;
		        }
		            System.out.println(count);
		    }
		        sc.close();
	}
		     
		    private static int F(int n)
		    {
		        String input = n < 1000 ? "0"+n : String.valueOf(n);
		        char[] a = input.toCharArray();
		        Arrays.sort(a); //����
//	�ڶ�ȡ����ʱ��Ҫ�����ݵ�ǿ��ת�����ɲ���String.valueOf(a)����aǿ��ת�����ַ�������
		        String min = String.valueOf(a);
		        int rs =  Integer.valueOf(new 
		        		
		        StringBuffer(min).reverse().toString()) - Integer.valueOf(min); //��minת��Ϊint���͵�����
		        //StringBuffer�ַ�������������String�кܴ�ͬ��.reverse��������Ϊ����
		        return rs;
		    }
		}