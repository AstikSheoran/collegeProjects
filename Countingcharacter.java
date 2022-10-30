import java.util.*;
public class Countingcharacter {    
        public static void main(String[] args) {    
            String string = "Assignment of java";  
            int count = 0;        
            for(int i = 0; i <String.length(); i++) {    
                if(string.charAt(i) != ' ')    
                    count++;    
            }    
            System.out.println("Total characters: " + count);    
        }    
    }     

