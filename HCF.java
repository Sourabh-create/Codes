import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a, b;
      int n;
      System.out.println("Enter first number :: ");
      a = sc.nextInt();
      System.out.println("Enter second number :: ");
      b = sc.nextInt();
      
      if(a<b)
      {
      n=a;
      }
      else{
      n=b;
      }
      
      
      for(int i=n;i>=1; i--)
      {
          if( a%i == 0 && b%i == 0 ){
              System.out.println("HCF of Given No. is :" +i);
              break;
          }
      }
   }
}
