import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n,factorial=1;
      System.out.println("Enter number of factorial");
      n=sc.nextInt();
       for(int i=1;i<=n;i++)
       factorial=factorial*i;
       System.out.print("factorial of given number"+ n +" is"+factorial);
      
   }
}