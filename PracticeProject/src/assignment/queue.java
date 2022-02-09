package assignment;

import java.util.Deque;
import java.util.Queue;

public class queue {
	
	public static void main(String[] args) {
		Queue<String> locationsQueue = new java.util.LinkedList<>();
		
		locationsQueue.add("a");
		locationsQueue.add("b");
		locationsQueue.add("c");
		locationsQueue.add("d");
		locationsQueue.add("e");
		System.out.println("Queue is : " + locationsQueue);
		System.out.println("Head of Queue : " + locationsQueue.peek());
		locationsQueue.remove();
		System.out.println("After removing Head of Queue : " + locationsQueue);
		System.out.println("Size of Queue : " + locationsQueue.size());
	}

}
