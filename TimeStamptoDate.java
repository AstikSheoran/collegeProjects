import java.sql.Timestamp;   
import java.util.*;
public class TimeStamptoDate {
    public static void main(String args[]){    
        Timestamp ts=new Timestamp(System.currentTimeMillis());  
        Date date=new Date(ts.getTime());  
        System.out.println(date);                     
}    
}
