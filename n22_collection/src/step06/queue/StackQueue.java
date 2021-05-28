package step06.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {
	public static void main(String[] args) {
		Stack stack = new Stack();
		Queue queue = new LinkedList();
		
		stack.push("1");
		stack.push("2");
		stack.push("3");
		
		queue.offer("1");
		queue.offer("2");
		queue.offer("3");
		
		System.out.println("=====stack에서 하나만 먼저 제거=====");
		System.out.println(stack.pop());//3이 제거되는 것을 확인
		
		System.out.println("=====queue에서 하나만 먼저 제거=====");
		System.out.println(queue.poll());//1.제거
	}
}
