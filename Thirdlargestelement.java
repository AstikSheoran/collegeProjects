import java.util.*;
public class Thirdlargestelement {
    public static int thirdlargestelement(int a[], int total){  
        int temp;  
        for (int i = 0; i < total; i++){
                    for (int j = i + 1; j < total; j++){
                        if (a[i] > a[j]){  
                            temp = a[i];  
                            a[i] = a[j];  
                            a[j] = temp;  
                        }  
                    }  
                }  
               return a[total-3];  
        }  

public static void main(String args[]){  
    int a[]={1,2,5,6,3,2};    
    System.out.println("Third Largest: "+thirdlargestelement(a,6)); 
}
}

 
