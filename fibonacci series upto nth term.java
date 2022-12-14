import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a=0,b=1;
      int sum =0;
      int n;
      System.out.println("Enter nth term");
      n=sc.nextInt();
      while(sum<=n)
      {
          System.out.print(sum + " ");
          a=b;
          b=sum;
          sum=a+b;
      }
   }
}