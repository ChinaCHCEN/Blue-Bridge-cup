package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_IP�ж� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			String s = sc.nextLine();
			String arr[] = s.split("\\.");

			char dex = 'Y';
			for (int i = 0; i < arr.length; i++)
			{
				if (arr[i].startsWith("0"))
				{
					dex = 'N';
					break;
				}
				try  //-----���ԣ������������dex=��N��������
				{
				if (Integer.valueOf(arr[i]).intValue() <= 255//��arr��i��ת��������
						& Integer.valueOf(arr[i]).intValue() >= 0) {
				}else 
				{
					dex = 'N';
					break;
				}
				
				//��������������ĸ���������֡���ᱨ�쳣��������쳣ֱ�ӻؽ�dex��ΪN
				} catch (Exception e)
				{
				dex='N';
				break;
				}
			}
		System.out.println(dex);
		}
	}
}
/*
 * import java.util.Scanner;
public class Main {
public static void main(String[] args) {
// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())
        {
        String s=sc.nextLine();
        boolean f=s.matches("
((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5])).
((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5])).
((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5])).
((\\d)|([1-9]\\d)|(1\\d{2})|(2[0-4]\\d)|(25[0-5]))");
        if(f)
        System.out.println("Y");
        else
        System.out.println("N");
        }
}
*/
