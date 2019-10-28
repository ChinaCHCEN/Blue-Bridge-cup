package 蓝桥杯官网;
/**
 *  HashSet类，是存在于java.util包中的类 [1]。同时也被称为集合，该容器中只能存储不重复的对象
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class 蓝桥杯练习题_不同单词个数统计 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String a1[] = a.split("\\s+"); //空格认不得        split("\\s+") 这个就能实现你的 多个空格切割的效果
		HashSet<String> set = new HashSet<String>();
		for(int i = 0;i < a1.length; i++)
		{
			set.add(a1[i]);
		}
		System.out.println(set.size());
	}	 
}

/*
Scanner input = new Scanner (System.in);
String str = input.nextLine();
if (!str.contains(" ")) // 特殊情况, 不考虑答案错误;
{
    System.out.println("1");
    return;    // 要写 return 结束语句的运行, 不然答案错误;
}
StringTokenizer st = new StringTokenizer(str, " ", true); // 字符分词器, 可以百度一下用法; 
Set<String> set = new HashSet<String>(); //泛型, HasSet 中不能有重复的元素, 利用这一性质可以计算不同字符的个数 
// 方法可以选, 易懂就行
while (st.hasMoreElements())
{
    set.add(st.nextToken());// 判断
     
}
System.out.println(set.size()-1); // 数组大小 --1;
 
}

}*/