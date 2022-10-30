
public class Countingcharacteroftwostring {
    public static void main(String[] args) {    
        String st1 = "Assignment of java";  
        int count1 = 0;        
        for(int i = 0; i <st1.length(); i++) {    
            if(st1.charAt(i) != ' ')    
                count1++;    
        }    
        System.out.println("Total characters of 1st string: " + count1);    
        String St2 ="Assignment should be submitted to Dheeraj";
        int count2=0;
        for(int i=0;i<St2.length();i++){
            if(St2.charAt(i)!=' ')
            count2++;
        }
        System.out.println("Total characters of 2nd string:"+count2);
    }    
}     

