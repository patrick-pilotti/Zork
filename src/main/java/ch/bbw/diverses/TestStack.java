package ch.bbw.diverses;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
		
		stack.push("Hello");
		stack.push("World");
		stack.push("how are you");
		
		String cmd = stack.pop();
		System.out.println(cmd);
	}

}
