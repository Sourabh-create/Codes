import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);
        int num1; int num2;
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        if(num1>num2)
        System.out.println(+num1+" is greater");
        else
        System.out.println(+num2+" is greater");
    }
}