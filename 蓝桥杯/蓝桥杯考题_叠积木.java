package À¶ÇÅ±­¹ÙÍø;

public class À¶ÇÅ±­¿¼Ìâ_µş»ıÄ¾ {
	private static int count = 0;
		public static void main(String[] args)
		{
	        int a[]=new int[10];  
	        for(int i=0;i<10;i++){  
	            a[i]=0;  
	        }  
	        fun(a,0);  
	        System.out.print(count);  
	    }  
	    public static void fun(int a[],int n){  
	        if(n==10){  
	            count++;  
	            /* 
	              if(count==2){ 

	                for(int i=0;i<10;i++) System.out.print(a[i]); 

	                System.out.println(); 

	            }*/  
	            return;  
	        }else{  
	            for(int i=0;i<=9;i++){  
	                a[n]=i;  
	                if(check(a,n)) 
	                	fun(a,n+1);  
	            }  
	        }  
	    }  
	    public static boolean check(int a[],int i){  
	       boolean flag=true;  
	        int h=Hang(i); 
	        if(i!=0){  
	            for(int j=0;j<i;j++){  
	            	if(a[i]==a[j]){  
	                    flag=false;  
	                    break;  
	                }  
	            }  
	            if(i!=1 && i!=3 && i!=6  && a[i]<a[i-h%4-1])  
	                flag=false;  
	            if(i!=2 && i!=5 && i!=9 && a[i]<a[i-h])  
	               flag=false;  	          
	        }  
	        return flag;  
	    }  
	    public static int Hang(int i){  
	        int h=0;  
	        if(i>=1 && i<=2) h=1;  
	        if(i>=3 && i<=5) h=2;  
	        if(i>=6 && i<=9) h=3;  
	        return h;            
	    }  
}

