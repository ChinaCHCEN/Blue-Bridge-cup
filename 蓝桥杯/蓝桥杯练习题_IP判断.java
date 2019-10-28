package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_IP判断 {
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
				try  //-----尝试，如果不是整数dex=‘N’，跳出
				{
				if (Integer.valueOf(arr[i]).intValue() <= 255//将arr【i】转换成整数
						& Integer.valueOf(arr[i]).intValue() >= 0) {
				}else 
				{
					dex = 'N';
					break;
				}
				
				//如果输入的数是字母而不是数字。则会报异常，这里的异常直接回将dex改为N
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
