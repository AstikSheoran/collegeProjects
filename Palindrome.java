import java.util.*;
class Palindrome{
    public static void main(String args[]){
      String original, reverse= "" ;
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the number to check if it is a palindrome:");
      original=input.nextLine();
      int length =original.length();
      for(int i=length-1; i>=0;i--)
      reverse=reverse+original.charAt(i);
      if (original==(reverse))  
         System.out.println("Entered number is  a palindrome.");  
      else  
         System.out.println("Entered number is not a palindrome.");
    }
}