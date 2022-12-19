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



//using for loop(methord 2)

import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int base;
      int power;
      System.out.println("Enter Base");
      base=sc.nextInt();
      System.out.println("Enter expo");
      power=sc.nextInt();
      double result=1;
      
      for(int i=1;i<=power;i++)
      result=result*base;
      {
          System.out.print("Answer= "+ result);
      }
   }
}
