package ���ű�����;

import java.util.Arrays;
import java.util.Scanner;

public class ���ű���ϰ��_����������� {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        int a[] = new int[n];
        for (int i = 1; i <= n; i++) 
        {
            int x = sc.nextInt();
             int c = 0;
            //�����ж��������Ƿ��и����� 
            for(int j = 0;j < a.length;j++) 
            {
                if(a[j] == x)
                {
                    c++;
                }
            }
            if(c == 0)
            {
                a[k] = x;
                k++;
            }else
                continue;
        }
        System.out.println(k);
        Arrays.sort(a);        	   //���÷������Զ�����
        for (int i = 0; i < a.length; i++)
        {
            if (a[i] != 0)
            {
                if(i != a.length - 1)
                    System.out.print(a[i] + " ");
                else
                    System.out.print(a[i]);
            }
        }
    }
}
