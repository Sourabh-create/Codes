import java.util.Scanner;
public class Main {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int n=25;
      
      int i=1;
      while(i*i<n)
      {
          i++;
          
      }
      
      if(i*i==n)
      System.out.println(n + " is a perfect square.");  
      else  
      System.out.println(n + " is not a perfect square.");  
   }
}