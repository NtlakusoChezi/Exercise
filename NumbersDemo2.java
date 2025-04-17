import java.util.*;

public class NumbersDemo2
{
   public static void main(String[] sfjh)
   {
      Scanner input = new Scanner(System.in); //Scanner to allow keyboard input
      
      System.out.println("Enter two integers separated by space or one inter, enter and the other");
      
      int a = input.nextInt();   //My first integer
      int b = input.nextInt();   //my second integer
      
      //Calling my methods           
      System.out.println(a + " twiced is " + displayTwiceNumber(a));
      System.out.println(b+ " twiced is " +displayTwiceNumber(b));
      
      System.out.println(a + " plus 5 is " +displayNumberPlusFive(a));
      System.out.println(b + " plus 5 is " +displayNumberPlusFive(b));

      System.out.println(a+ " squared is " +displayNumberSquared(a));
      System.out.println(b + " squared is " +displayNumberSquared(b));

   }
   //Methods definitions
   public static int displayTwiceNumber(int a)
   {
      return 2*a;
   }
   
   public static int displayNumberPlusFive(int a)
   {
      return a+5;
   }
   public static int displayNumberSquared(int a)
   {
      return a*a;
   }
   
}