package ���ű�����;

import java.util.Scanner;

public class ���ű�����_��ƽ���� {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        double a = sc.nextDouble();  
        double[] b = new double[4];  
        double c =  Math.sqrt(a);  //����ƽ����
        double l,x;  
        boolean sign = false;  
        for(int i=0; i<=c; i++) {  
            for(int j=i; j<=c; j++) {  
                for(int k=j; k<=c; k++) {  
                    l = a-i*i-j*j-k*k;   //���ĸ�������ͨ������ó��������Ϳ��Լ���һ��ѭ�����������Ч��  
                    x = Math.sqrt(l);    //Math.sqrt()�Ĳ���������double����  
                    if(x-(int)x == 0) {   
                           if(sign==false) {  //��ǵ�һ����������������ĸ������Ѿ�ȡ��  
                                sign = true;  
                                b[0]=i;  
                                b[1]=j;  
                                b[2]=k;  
                                b[3]=x;  
                               break;  
                            }else  
                            {  
                                if(i>b[0]){//����i�Ǵ�0��ʼȡ�ģ�������sign=true��ʱ���i�Ѿ���������������Сi��  
                                    break;  
                                }else if(j<b[1]){//�������Ŀ��ܽ������ a,b,c,d Ϊ���������������е�ԭ�����ɸѡ  
                                    b[1]=j;  
                                    b[2]=k;  
                                    b[3]=x;  
                                   break;  
                                }else if(j==b[1]&&k<b[2]){//��a��b��c��ȷ����������������Сֵ��ʱ��d��Ȼ��ȷ�������������ٱȽ���  
                                   b[2]=k;  
                                   b[3]=x; 
                                   break;  
                                }   
                           }   
                    }  
                }  
            }  
        }  
        for(int i=0; i<4; i++) {  
            System.out.print((int)b[i]+" ");  
        }  
    }  
}

