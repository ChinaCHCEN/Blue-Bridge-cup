package ���ű�����;
/**
 *  HashSet�࣬�Ǵ�����java.util���е��� [1]��ͬʱҲ����Ϊ���ϣ���������ֻ�ܴ洢���ظ��Ķ���
 */
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;
public class ���ű���ϰ��_��ͬ���ʸ���ͳ�� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String a1[] = a.split("\\s+"); //�ո��ϲ���        split("\\s+") �������ʵ����� ����ո��и��Ч��
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
if (!str.contains(" ")) // �������, �����Ǵ𰸴���;
{
    System.out.println("1");
    return;    // Ҫд return ������������, ��Ȼ�𰸴���;
}
StringTokenizer st = new StringTokenizer(str, " ", true); // �ַ��ִ���, ���԰ٶ�һ���÷�; 
Set<String> set = new HashSet<String>(); //����, HasSet �в������ظ���Ԫ��, ������һ���ʿ��Լ��㲻ͬ�ַ��ĸ��� 
// ��������ѡ, �׶�����
while (st.hasMoreElements())
{
    set.add(st.nextToken());// �ж�
     
}
System.out.println(set.size()-1); // �����С --1;
 
}

}*/