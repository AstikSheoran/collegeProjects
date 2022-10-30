import java.util.*;
public class ReplaceSpace    
{    
    public static void main(String[] args) {    
        String string = "Assignment of java";    
        char ch = '-';    
            
        //Replace space with specific character ch    
        string = string.replace(' ', ch);    
            
        System.out.println("String after replacing spaces with given character: ");    
        System.out.println(string);    
    }    
}      