package datastructures;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * A minimal queue implementations that uses two stacks as the underlying data
 * structure.
 * 
 * @author Dusan Eremic
 *
 * @param <T>
 *            The type of elements stored in this queue
 */
public class MyQueue<T> {

	private Stack<T> in = new Stack<>();
	private Stack<T> out = new Stack<>();

	public MyQueue() {

	}

	/**
	 * Inserts the specified element into this queue.
	 * 
	 * @param t
	 *            The element to add
	 */
	public void add(T t) {
		in.push(t);
	}

	/**
	 * Retrieves and removes the head of this queue.
	 *
	 * @return The head of this queue
	 * @throws NoSuchElementException
	 *             if this queue is empty
	 */
	public T remove() {
		if (in.isEmpty() && out.isEmpty()) {
			throw new NoSuchElementException("The Queue is empty!");
		}

		if (out.isEmpty()) {
			while (!in.isEmpty()) {
				out.push(in.pop());
			}
		}

		return out.pop();
	}
}
