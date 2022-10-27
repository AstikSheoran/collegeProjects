public class oddAndEven {
    public static void main(String args[]){  
        int a[]={12,56,5,3,98,100};  
        System.out.println("Odd Numbers:");  
        for(int i=0;i<a.length;i++){  
        if(a[i]%2!=0){  
        System.out.println(a[i]);  
        }  
        }  
        System.out.println("Even Numbers:");  
        for(int i=0;i<a.length;i++){  
        if(a[i]%2==0){  
        System.out.println(a[i]);  
        }  
        }
    }
}