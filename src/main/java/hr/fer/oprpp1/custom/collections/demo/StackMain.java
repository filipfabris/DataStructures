package hr.fer.oprpp1.custom.collections.demo;


import hr.fer.oprpp1.custom.collections.ObjectStack;

public class StackMain {

	public static void main(String[] args) {
		//"9 5 5 / - 3 2 * - 18 +"
		String input;

		if (args.length != 1) {
            throw new IllegalArgumentException("args.length should be 1 and the args[0] should be the whole expression");
        }

		input = args[0];

		ObjectStack stack = new ObjectStack();

		String[] elements = input.split(" ");

		for (String element : elements) {

			if (element.matches("-?\\d+")) {
				stack.push(element);

			} else if (element.matches("[+\\-\\/*%]")) {
				try {

					Integer second = Integer.valueOf(stack.pop().toString());
					Integer first = Integer.valueOf(stack.pop().toString());

					switch (element) {
					case "+": {
						stack.push(first + second);
						break;
					}
					case "-":{
						stack.push(first - second);
						break;
					}
					case "*": {
						stack.push(first * second);
						break;
					}
					case "%": {
						if (second == 0) {
							throw new ArithmeticException();
						}
						stack.push(first % second);
						break;
					}
					case "/": {
						if (second == 0) {
							throw new ArithmeticException();
						}
						stack.push(first / second);
						break;
					   } 
				    }

				} catch (Exception e) {
					throw new RuntimeException("Stack is empty");
				}

			} else {
				throw new RuntimeException("Wrong input");
			}


		}
		if (stack.size() != 1) {
			throw new Error("Stack should not have more or less elements then 1");
		} else {
			System.out.println("Result: " + stack.pop());
		}
	}
}
