import java.util.*;
public class Print {
    public static void main(String args[]){
        System.out.print("Enter the character:");
        Scanner input=new Scanner(System.in);
        char cha=input.next().charAt(0);
        int asciivalue=cha;
        System.out.println("ASCII value of "+cha+" is:"+asciivalue);
    }
}
