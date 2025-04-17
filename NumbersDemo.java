public class NumbersDemo
{
   public static void main(String[] sfjh)
   {
      int a = -4 ; int b = 7; // The defined integers by the user
      
      NumbersDemo n = new NumbersDemo();
      
      //Calling my methods
      System.out.println(a + " twiced is " + displayTwiceNumber(a));
      System.out.println(b+ " twiced is " +displayTwiceNumber(b));
      
      System.out.println(a + " plus 5 is " +displayNumberPlusFive(a));
      System.out.println(b + " plus 5 is " +displayNumberPlusFive(b));

      System.out.println(a+ " squared is " +displayNumberSquared(a));
      System.out.println(b + " squared is " +displayNumberSquared(b));


   }
   //Methods definations
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
