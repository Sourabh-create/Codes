import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Number");
        int a;
        a= sc.nextInt();
        if (a%2==0)
        {
        System.out.println(+a+" is Even Number");
        }
        else
        {
         System.out.println(+a+" is Odd Number");
        }
    }
}