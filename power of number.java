import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int base;
      int expo;
      System.out.println("Enter Base");
      base=sc.nextInt();
      System.out.println("Enter expo");
      expo=sc.nextInt();
      
      double result=Math.pow(base,expo);
      System.out.println("Answer = " + result);
   }
}