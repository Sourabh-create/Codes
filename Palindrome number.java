import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n;
	    int num =0;
	    n=sc.nextInt();
	    int n1=n;
	    while(n>0)
	    {
	        num=num*10+n%10;
	        n=n/10;
	    }
	    if (n1==num)
	    {
	    System.out.println(num+ " is a Palindrome ");
	    }
	    else
	    System.out.println(num+ " is not a Plaindrome ");
	}
}