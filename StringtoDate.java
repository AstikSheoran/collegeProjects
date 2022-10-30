import java.util.*;
public class StringtoDate { 
        public static void main(String[] args)throws Exception {  
            String sDate1="11/10/2022";  
            Date date1=new Date("dd/MM/yyyy").parse(sDate1);  
            System.out.println(sDate1+"\t"+date1);  
        }  
        }  

