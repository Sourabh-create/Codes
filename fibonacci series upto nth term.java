import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a=0,b=1;
      int n;
      System.out.println("Enter nth term");
      n=sc.nextInt();
      System.out.print(a+" "+ b +" ");
      for(int i=1;i<=n-2;i++){
          int sum = a+b;
          System.out.print(sum + " ");
          a=b;
          b=sum;
      }
   }
}
