import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    int num=0;
	    n=sc.nextInt();
	    while(n>0)
	    {
	        num=num*10+n%10;
	        n=n/10;
	    }
	    
	    System.out.println("Reverse of number is "+num);
}}
