import java.util.Scanner;

public class CodesCracker
{
   public static void main(String[] args)
   {
      int numberOne, numberTwo, add;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      numberOne = s.nextInt();
      System.out.print("Enter the Second Number: ");
      numberTwo = s.nextInt();
      
      add = numberOne + numberTwo;
      System.out.println("\nResult = " +add);
   }
}