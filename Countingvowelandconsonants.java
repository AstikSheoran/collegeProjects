import java.util.*;
public class Countingvowelandconsonants {    
        public static void main(String[] args) {    
            int vovelCount = 0, consonantCount = 0; 
            String str = "This is a assignemnt of java";      
            str = str.toLowerCase();    
            for(int i = 0; i < str.length(); i++) {        
                if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {    

                    vovelCount++;    
                }        
                else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {         
                    consonantCount++;    
                }    
            }    
            System.out.println("Number of vowels: " + vovelCount);    
            System.out.println("Number of consonants: " + consonantCount);    
        }    
    }   

