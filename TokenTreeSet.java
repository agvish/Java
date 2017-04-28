/*
 * @author Vishal Agarwal
 */

/*Program that uses a StringTokenizer to tokenize a line of text & place each token in a 'treeSet'.*/ 
/* Print the elements of the treeSet.*/ 

import java.util.*;
public class TokenTreeSet 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str);          //Object creation of 'StringTokenizer' class with default delimeters
        TreeSet ts = new TreeSet();                             //Object creation of 'TreeSet' class
        System.out.println("Would you like to print all the tokens of above String.\nIf YES. Press 1 : ");
        int ch = sc.nextInt();
        while(st.hasMoreElements())                         //The loop runs until there are no further tokens
        {
            String token = st.nextToken();
            
            /*Condition if user wants to print each tokens of String entered as input*/
            
            if(ch == 1)
                System.out.println(token);
            ts.add(token);                                          //adds each token to the treeset as a node
        }
        System.out.println("\n\nThe tokens of String in sorted order are: ");
        System.out.println(ts);                                     //Prints all the nodes of the tree.
        sc.close();
    }
    
}
