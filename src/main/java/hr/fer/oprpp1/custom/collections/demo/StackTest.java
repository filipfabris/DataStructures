package hr.fer.oprpp1.custom.collections.demo;

import hr.fer.oprpp1.custom.collections.ObjectStack;

public class StackTest {
	
	public static void main(String[] args) {
		ObjectStack stack = new ObjectStack();
		
		stack.push(2);
		stack.push(3);
		
		stack.peek();
		
		stack.pop();
		
		stack.pop();

		
		stack.pop();


	}

}
