
Introduction to stack

stack data structure is a type of data structure called LIFO or last-in, first-out maeaning the first elements that come is the element to be taken out last.

keywords:
stack.push - add object onto our stack 


There are 5 methods in stack:
1) push method 

2)  pop method 

import java.util.Stack;

public class stack { 
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
    
        stack.push(10);
        stack.push(11);
        stack.push(34);
        stack.push(23);
        stack.push(60);

        System.out.println("Stack before pop: " + stack);  // [10, 11, 34, 23, 60]
        System.out.println("Popped element: " + stack.pop()); // 60
        System.out.println("Stack after pop: " + stack); // [10, 11, 34, 23]
    }
}


3) peek method 

4) search method 

5) empty method 

