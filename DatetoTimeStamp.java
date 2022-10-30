import java.util.*;
import java.sql.Timestamp;
public class DatetoTimeStamp {
    public static void main(String args[]){    
        Date date = new Date();  
        Timestamp ts=new Timestamp(date.getTime());  
        System.out.println(ts);                     
    }    
}
