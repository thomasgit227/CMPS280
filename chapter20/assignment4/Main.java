package chapter20.assignment4;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args) {
        MyStack myStack = new MyStack(); 
 
        myStack.add(7);     
        myStack.add(54);    
        myStack.add("It's Lit");     
        myStack.add(true);     
        myStack.add(123.69); 
     
        printStack(myStack);     
        Object topOfStack = myStack.peek();     
        System.out.println("Top = " + topOfStack.toString());     
        printStack(myStack); 
     
        topOfStack = myStack.pop();     
        System.out.println("Top = " + topOfStack.toString());     
        printStack(myStack); 
     
        myStack.push("Look Who is On Top Now Losers!");     
        printStack(myStack); 
     
    } 
     
    public static void printStack(MyStack s)   {     
        System.out.println(Arrays.toString(s.toArray())); 
    } 
} 
