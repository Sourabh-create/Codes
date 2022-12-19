import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      
      int num;
      int sum=0;
      System.out.println("Enter number");
      num=sc.nextInt();
      int n1=num;
      
      for(int i=1;i<num;i++){
          if(num%i==0){
              sum=sum+i;
          }
      }
          if(n1==sum)
          System.out.println (num + " Is a perfect number");
          else
          System.out.println (num + " Is not a perfect number");
      }
   }