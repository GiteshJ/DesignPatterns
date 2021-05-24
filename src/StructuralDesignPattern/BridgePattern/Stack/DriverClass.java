package StructuralDesignPattern.BridgePattern.Stack;

import java.util.Random;

public class DriverClass {

	public static void main(String[] args) {

        helper(new StackFIFO(new StackList()));
        helper(new StackFIFO(new StackArray()));
        helper(new StackFIFO(new StackArray(15)));
        
        hanoihelper(new StackHanoi(new StackList()));
        hanoihelper(new StackHanoi(new StackArray()));
        hanoihelper(new StackHanoi(new StackArray(5)));
        
    }
	
	public static void helper(Stack stack) {
		
		for (int i=1; i <= 15; i++) {
            
            stack.push( i );
        }
  
    
	    while (!stack.isEmpty()) {
	        System.out.print(stack.pop() + "  ");
	    }
	    System.out.println();
    
	}
	
	public static void hanoihelper(Stack stack) {
		
		Random rn = new Random();
        for (int i=1; i < 15; i++) {
            stack.push(rn.nextInt(20));
        }
  
    
	    while (!stack.isEmpty()) {
	        System.out.print(stack.pop() + "  ");
	    }
	    System.out.println();
    
	}
	
}
