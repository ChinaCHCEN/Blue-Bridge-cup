package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯练习题_数组替换 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[] a = new int[m+n];
		int[] b = new int[n];
		for(int i = 0;i < m;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int j = 0;j < n;j++)
		{
			b[j] = sc.nextInt();
		}
		int m1 = sc.nextInt();
		int n1 = sc.nextInt(); //将数组前n项，放到数组a的后m项
		if (n1 == 0) // 当n1为0时 ,输出a 数组;
        {
            for (int i = 0; i < m; i++)
            {
                if (i == 0)
                {
                    System.out.print(a[i]);
                }else
                {
                    System.out.print("," + a[i]);
                }
            }
        } else
        {
            Add(a, m1, b, n1);
        }
    }
    public static void Add(int a[], int m1, int b[], int n1)
    {
        int[] c = new int[n1];
        int x = m1 + n1;
        for (int i = 0; i < n1; i++)
        {
            c[i] = b[i];
        }
        for (int i = 0; i < n1; i++)
        {
            if (m1 < x)
            {
                a[m1] = c[i];
                m1++;
            }
        }
        for (int i = 0; i < x; i++)
        {
            if (i == 0)
            {
                System.out.print(a[i]);
            } else
            {
                System.out.print("," + a[i]);
            }
        }
    }
}
