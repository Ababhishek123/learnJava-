package abhishek;
import java.util.Scanner;

public class greatestCommonDivisor {

  public static void main(String[] args) {
      //greatest common divisor
      Scanner input =new Scanner(System.in);
      System.out.print("enter first no :");
      int x=input.nextInt();
      System.out.print("enter second no. :");
      int y =input.nextInt();
      
      int A=x;
      int B=y;
      int R=A%B;
      while(R>0){
        A=B;
        B=R;
        R=A%B;
        
      }  
      System.out.println("GCD OF:"+x+","+y+"="+B);  

  }
  

}
