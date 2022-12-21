import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int num;
      int sum=0;
      System.out.println("Enter number");
      num=sc.nextInt();
      int n1=num;
      
      while(num!=0)
      {
          sum=sum+num%10;
          num=num/10;
      }
          if(n1%sum==0)
          System.out.println ("harshad number");
          else
          System.out.println ("not a harshad number");
      }
   }