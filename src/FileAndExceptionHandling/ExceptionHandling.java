package FileAndExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        try{

            System.out.println(("Enter a whole number to divide: "));
            int x = scanner.nextInt();

            System.out.println("Enter a whole number to divide by: ");
            int y = scanner.nextInt();

            int z = x/y;

            System.out.println("result: " + z);
        }
        catch (ArithmeticException e){
            System.out.println("You can't divide by zero!");
        }
        catch (InputMismatchException e){
            System.out.println("Invalid input");
        }
        catch(Exception e){
            System.out.println("Something went wrong!");
        }
        finally{
            System.out.println("This will always print");
            scanner.close();
        }
    }
}
