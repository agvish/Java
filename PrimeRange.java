/*Program to generate Prime Number between a given range by user.*/


import java.util.Scanner;           //importing related Java Package
class PrimeRange                    //Defining Class
{
 public static void main(String args[])
 {
  Scanner S=new Scanner(System.in);         //Defining Scanner Class
  int start,stop,flag,range=0;
  System.out.println("Enter the start and stop range.");
  start=S.nextInt();
  stop=S.nextInt();
  if(start<2||stop<start)                  //Checking for valid start stop range
  {
    System.out.println("Enter the correct range.");
  }
  else
  {
    System.out.println("Prime number in range is-->");
    for(int i=start;i<=stop;i++)            //Loop between start and last range
    {
      flag=0;
      range=(int)Math.sqrt(i);
      for(int j=2;j<=range;j++)
      {
        if(i%j==0)                         //Checking for divisibility
        {
          flag=1;
          //break;
        }
      }
      if(flag==0)
      System.out.println(i);            //Result Display
    }
  }
 }                                     //End of main method
}                                      //End of class
