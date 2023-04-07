import java.io.*;
import java.util.*;
public class Exception extends Throwable {
    public Exception(String s) {
    }

    public static void main(String args [])
    {
        int a,b,c = 0;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter the first number: ");
            a = sc.nextInt();
            System.out.println("Enter the second number: ");
            b = sc.nextInt();

            c = a/b;
            System.out.println("The value after dividing two numbers is: "+c);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
    }
}