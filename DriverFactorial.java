/*
Program to compute factorial of a number and catches the result in a datatype 'long'. 
'long' type of variable has its own range. This program checks the argument passed and "throws an exception" if it is too big or too small"
 */
import java.util.Scanner;
class IllegalArgumentException extends Exception        //user defined exception class extending the 'Exception' class
{
    public IllegalArgumentException()
    {
        super("Value cant be negative");                         //invoking the default constructor if user enters a negative value
    }
    public IllegalArgumentException(int n)
    {
        super(n+"is out of range.Specify within 20");        //invoking the default constructor if user enters a value greater than 20
    }
}




public class DriverFactorial               //class that will compute the factorial of number
{

    /* Function to calculate factorial of number recursively*/
    public static long fact(int f)
    {
        if(f==0)
            return 1;
        else
            return f*(fact(f-1));
    }


    public static void main(String []args)throws IllegalArgumentException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number whose fctorial need to be found");
        int x=sc.nextInt();
        long fac=0;
        try{
            if(x>20)
            throw new IllegalArgumentException(x);
            if(x<0)
            throw new IllegalArgumentException();
            fac=fact(x);
            System.out.println("Factorial of "+x+" is : "+fac);
        }
        catch(Exception e)                 /*For exceptions other than range specification*/
        {
            System.out.println(e);
            System.out.println("Factorial can't be calculated because of some exception.");
        }
    }
}
