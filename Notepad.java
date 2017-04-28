/*
 * author Vishal Agarwal
 */

/*Program that whenever executed keeps on invoking the “NOTEPAD”, once in every second. */

public class Notepad extends Thread           //Extending the thread class
{
    @Override
    public void run()       
    {
        Runtime r = Runtime.getRuntime();       //Returns the object reference of Runtime Class
        try
        {
            for(;;)
            {
                Process p = r.exec("Notepad");      //Executes Notepad application
                sleep(1000);                        //Sleeps the process for 1 second
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
class Malicious 
{
    public static void main(String args[])
    {
        System.out.println("YOU HAVE BEEN HACKED");
        Notepad np = new Notepad();
        np.start();                             //Starts the exceution Of the thread 'Notepad'
    }
    
}