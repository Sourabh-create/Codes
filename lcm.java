import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a;
      int b;
      int n;
      System.out.println("Enter first number :: ");
      a = sc.nextInt();
      System.out.println("Enter second number :: ");
      b = sc.nextInt();
      
      if(a>b)
      {
      n=a;
      }
      else{
      n=b;
          
      }
      for(int i=n;i<a*b; i++)
      {
          if( i%a == 0 && i%b == 0){
          System.out.println("LCM of given two numbers is : " +i);
          break;
          }
      }
      }
   }