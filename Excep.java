import java.io.*;
import java.util.Scanner;
    public class Excep
    {
        public static void main(String args[])
        {
            int a,b,c = 0;
            Scanner sc = new Scanner(System.in);
            temp12 t = new temp12();
            try
            {
                System.out.println("Enter the first number: ");
                a = sc.nextInt();
                System.out.println("Enter the second number: ");
                b = sc.nextInt();

                c = a/b;
                t.display();
                System.out.println(c);
            }catch(Exception e)
            {
                System.out.println("Arthametic Exception while dividing...");
            }

        }
    }
    class udef extends Exception
    {
        public udef(String s)
        {
            super(s);
        }
    }
    class temp12
    {
        void display() throws Exception
        {
            System.out.print("The value of c is: ");
        }
    }

