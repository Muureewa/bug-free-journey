import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static java.lang.Math.abs;

/*
Name: Murad Mohammed 
Date: 03/02/2023
Java SDEV 219 T/Th
In Class Assignment 3/2

*/

public class Main {
    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<>();
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        myStack.push(7);
        myStack.push(8);
        myStack.push(9);
        myStack.push(10);
        myStack.push(12);
        System.out.println(isConsecutive(myStack));


        System.out.println(copyStack(myStack));
        System.out.println(myStack);
    }

    // Problem 1
    public static boolean isConsecutive(Stack<Integer> s){
        boolean isConsec = false;
        Stack<Integer> two = new Stack<>();

        while(s.size()>1){
            two.push(s.pop());
            if(two.peek() == s.peek()+1){
                isConsec = true;
            }else{
                while(!two.isEmpty()){
                    s.push(two.pop());
                }
                return false;
            }
        }

        while(!two.isEmpty()){
            s.push(two.pop());
        }
        return isConsec;
    }

    //Problem 2

    public static Stack<Integer> copyStack(Stack<Integer> original){
        Stack<Integer> newStack = new Stack<Integer>();
        Stack<Integer> holding = new Stack<Integer>();
        while(!original.isEmpty()) {
            holding.push(original.pop());
        }
        while(!holding.isEmpty()){
            newStack.push(holding.peek());
            original.push(holding.pop());
        }
        return newStack;
    }

}