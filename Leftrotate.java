import java.util.*;
public class Leftrotate {
    public static void main (String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		int arr[]= new int[10];
		arr[0]=5;
		arr[1]=34;
		arr[2]=23;
		arr[3]=6;
		arr[4]=84;
		for(int i=0;i<arr.length;i++){
		    System.out.println(arr[i]+" ");
		}
		for(int i=5;i>=2;i--){
		    arr[i+1]=arr[i];
		}
		arr[2]=15;
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}