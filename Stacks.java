/*
 * @author Vishal Agarwal
 */

/*Program to implement a stack using the built-in Stack class of Java.*/

import java.util.*;
public class Stacks
{
    public static void main(String args[])
    {
        /*Variable to store the choice of user, element to be pushed and popped element*/
        int ch,push,pop;
        boolean empty;                                                  //variable to hold true/false if the stack is Empty
        Scanner sc = new Scanner(System.in);
        Stack <Integer> st=new Stack<Integer>();
        do{
            System.out.println("1. PUSH an element into the Stack.");
            System.out.println("2. POP an element from the Stack");
            System.out.println("3. Peek into the Stack");
            System.out.println("4. Search for an element in the Stack");
            System.out.println("0. EXIT");
            System.out.println("Enter your choice.\n");
            ch = sc.nextInt();
            empty = st.empty();                                           //Checks for empty stack
            switch(ch)
            {
                case 0: System.out.println("Thank You for Programming");
                        break;
                case 1: System.out.println("Enter the element to be PUSHED");
                        push=sc.nextInt();
                        st.push(push);                                      //Push the element into the stack
                        break;
                case 2: if(empty == true)
                        {
                            System.out.println("Stack UNDERFLOW");
                            break;
                        }
                        pop = st.pop();                                     //Holds the popped element
                        System.out.println("Popped element is : "+pop);
                        break;
                case 3: if(empty == true)
                        {
                            System.out.println("Stack UNDERFLOW");
                            break;
                        }
                        int peek = st.peek();                               //Holds the value of element at the top of stack
                        System.out.println("Element at top is : "+peek);
                        break;
                case 4: if(empty == true)
                        {
                            System.out.println("Stack UNDERFLOW");
                            break;
                        }
                        System.out.println("Enter the element to be Searched");
                        int src = sc.nextInt();
                        int found = st.search(src);                         //Holds the postion of element to be searched
                        if(found > 0)
                            System.out.println("Element : "+src+" found at position "+found);
                        else
                            System.out.println("Element not found");
                        break;
                default: System.out.println("Wrong Choice!!");
            }
        }while(ch!=0);
        sc.close();
    }
    
}
