package 蓝桥杯官网;

import java.util.Scanner;

public class 蓝桥杯考题_四平方和 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);  
        double a = sc.nextDouble();  
        double[] b = new double[4];  
        double c =  Math.sqrt(a);  //计算平方根
        double l,x;  
        boolean sign = false;  
        for(int i=0; i<=c; i++) {  
            for(int j=i; j<=c; j++) {  
                for(int k=j; k<=c; k++) {  
                    l = a-i*i-j*j-k*k;   //第四个数可以通过计算得出，这样就可以减少一层循环，提高运行效率  
                    x = Math.sqrt(l);    //Math.sqrt()的参数必须是double类型  
                    if(x-(int)x == 0) {   
                           if(sign==false) {  //标记第一组可以满足条件的四个数，已经取到  
                                sign = true;  
                                b[0]=i;  
                                b[1]=j;  
                                b[2]=k;  
                                b[3]=x;  
                               break;  
                            }else  
                            {  
                                if(i>b[0]){//由于i是从0开始取的，所以在sign=true的时候的i已经是满足条件的最小i了  
                                    break;  
                                }else if(j<b[1]){//对其他的可能结果，按 a,b,c,d 为联合主键升序排列的原则进行筛选  
                                    b[1]=j;  
                                    b[2]=k;  
                                    b[3]=x;  
                                   break;  
                                }else if(j==b[1]&&k<b[2]){//当a，b，c都确定是满足条件的最小值的时候，d自然被确定下来，不用再比较了  
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

