package 蓝桥杯官网;
/**
 * 使用 String.valueOf() 进行数据转换，如果被转换的数据为 null, 则这种方法将返回一个 "null" 字符串。
   String） 方法进行转换时，如果被转换的数据为 null, 则返回 null 对象而不是一个 "null" 字符串。
 */
import java.util.Arrays;
import java.util.Scanner;

public class 蓝桥杯练习题_数字黑洞 {
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
		        Arrays.sort(a); //升序
//	在读取数据时需要对数据的强制转换，可采用String.valueOf(a)，把a强制转换成字符串类型
		        String min = String.valueOf(a);
		        int rs =  Integer.valueOf(new 
		        		
		        StringBuffer(min).reverse().toString()) - Integer.valueOf(min); //将min转换为int类型的数据
		        //StringBuffer字符串处理方法。与String有很大不同。.reverse（）方法为逆序
		        return rs;
		    }
		}