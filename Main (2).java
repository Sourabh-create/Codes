import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Value");
        int n; 
        int sum=0;
        n = sc.nextInt();
        for(int i=0;i<=n;i++)
            sum=sum+i;
        System.out.println(sum);
    }
}