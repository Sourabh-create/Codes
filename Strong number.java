import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int number;
      int rem=0;
      int sum =0;
      System.out.println("Input Number :");
      number=sc.nextInt();
      int n1=number;
      
      while(number>0)
      {
          rem=number%10;
          
      int factorial=1;
      for(int i=1; i<=rem; i++)
      {
          factorial=factorial*i;
      }
      
      sum=sum+factorial;
      number=number/10;
      }
      if(n1==sum)  
      System.out.println(n1 + " is a special number.");  
      else  
      System.out.println(n1 + " is not a special number.");  
   }
}