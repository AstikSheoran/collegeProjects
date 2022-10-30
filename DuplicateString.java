import java.util.*;
public class DuplicateString {
    public static void main(String args[]) {

        String str = "Java";
        int a = 0;
        char ch[] = str.toCharArray();
        System.out.println("Duplicate Characters are:");
        for (int i = 0; i < str.length(); i++) {
         for (int j = i + 1; j < str.length(); j++) {
          if (ch[i] == ch[j]) {
           System.out.println(ch[j]);
           a++;
           break;
          }
         }
        }
       }
      }
