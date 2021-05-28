package step07;

import step07.stack.MyStack;
import step07.stack.StackBasic;

public class TestApp {
	public static void main(String[] args) {
		//예제 1
		StackBasic.process();
		
		//예제 2
		MyStack stack = new MyStack();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		
		System.out.println(stack.pop()); //D
		System.out.println(stack.pop()); //C
		
		System.out.println(stack.empty()); //false
		System.out.println(stack);//A,B
		
		System.out.println(stack.peek()); //B
		System.out.println(stack.search("A")); //0
	}
}
