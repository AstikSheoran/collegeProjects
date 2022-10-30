import java.util.*;
public class Pattern {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        int num;
        System.out.println("Enter the value of n:");
        int n=input.nextInt();
        input.close();
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}