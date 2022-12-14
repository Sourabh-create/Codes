import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n, rem;
	    int result=0;
	    System.out.println("Enter A Number");
	    n=sc.nextInt();
	    int n1=n;
	    while(n1!=0)
	    {
	        rem=n1%10;
	        result=result+rem*rem*rem;
	        n1=n1/10;
	    }
	    if(n==result)
	    System.out.println(n+" is a Armstrong number");
	    else 
	    System.out.println(n+" is not a Armstrong number");
	}
}