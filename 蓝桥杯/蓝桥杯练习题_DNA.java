package ���ű�����;

import java.util.Scanner;

public class ���ű���ϰ��_DNA {
	public static void main(String[] args) 
	{
	    Scanner in = new Scanner(System.in);
	    int N = in.nextInt();
	    int k,front,flag,after,row;
	    for (int i = 0;i < N; i++){
	        int a = in.nextInt();
	        int b = in.nextInt();
	        front = 0;
	        flag = 1;
	        row = a + (a-1)*(b-1);                //һ���ж����У���ʾ������
	        after = a - 2;                        //���ո�������ʾ������
	        for(int j = 0; j < row; j++)
	        {
	            for(int m = 0;m < front; m++)     //��ӡ��ͷ�Ŀո�
	                System.out.print(" ");
	            System.out.print("X");
	            // ����������жϣ���˵���������µ�����
	            // flag > 0   ˵���������������   С�� 0  ���������������
	            if(front == a/2 || (front == 0&&j > 0))
	            {
	                flag = -flag;
	                if(flag < 0)
	                {
	                    front--;	//�ո���
	                    after = 1;	
	                }else
	                {
	                    after = a - 2;
	                    front++;
	                }
	                //��仰�����жϣ���ǰ�У��Ƿ��� ֮��Ҫ��ӡһ�� X������Ǿͻ��У�Ȼ�� ��������ѭ��
	                if(((front+1) == a/2 && after == 1) || ((front-1) == a/2 && after == a-2  ) )
	                {
	                    System.out.println();
	                    continue;
	                }
	            }
	            else {
	                if (flag > 0)
	                    front++;
	                else
	                    front--;
	            }
	            for (k = 0;k < after; k++)            //��ӡ�м�Ŀո�
	                System.out.print(" ");
	            System.out.println("X");
	            if(flag > 0)
	                after = after - 2;
	            else
	                after = after + 2;
	        }
	        // ��ǰһ�ν����󣬻���   ���Ǹ�ʽҪ��
	        System.out.println();
	    }
	}
}
