/*
 * @author Vishal Agarwal
 */

/*Program that reads in a series of first names and stores them in a LinkedList.*/

import java.util.*;
public class NameList 
{
    static LinkedList ll = new LinkedList();                //Static object creation of Linked List Class
    
    /*Method which will search for a name which is previously inserted in List*/
    
    public boolean search(String src)
    {
        boolean found = ll.contains(src);                   //returns true/false if the element is present in list
        return found; 
    }
    public static void main(String args[])
    {
        String name="";                                 //Variable to store name
        int ch = 1;                                     //Variable to store the choice for continuing the process of insertion
        Scanner sc = new Scanner(System.in);
        NameList nl = new NameList();                   //Object creation of 'NameList' class             
        while(ch == 1)
        {
            System.out.println("Enter the First name :");
            name = sc.nextLine();
            boolean duplicate = nl.search(name);        //Method call to 'search(String)' for searching a name previously inserted
            
            /*If a name is there it wouldn't be stored in the list*/
            
            if(duplicate == true)
                System.out.println("Name already in the list. Enter a diiferent name.");
            else
            {
                ll.addLast(name);
                System.out.println("Element inserted in List");
            }
            System.out.println("Press 1 to continue.");     //Asking for continuation
            ch = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Enter the name to be Searched");
        String nameSrch = sc.nextLine();        //Method call to 'search(String)' for searching a name
        if(nl.search(nameSrch) == true)
        {
            int position = ll.indexOf(nameSrch);  //Returns the position of name in list if a match is found
            System.out.println("Name found at position :"+(position+1));
        }
        else
            System.out.println("Name not found");
        sc.close();
    }
}
