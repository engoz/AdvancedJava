package com.eng.behavior.linkedlists.linkedlists;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by servicium on 10.10.2016.
 * <p>
 * add(element): Adds an element to the tail.
 * addFirst(element): Adds an element to the head.
 * addLast(element): Adds an element to the tail.
 * offer(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
 * offerFirst(element): Adds an element to the head and returns a boolean to explain if the insertion was successful.
 * offerLast(element): Adds an element to the tail and returns a boolean to explain if the insertion was successful.
 * iterator(): Returna an iterator for this deque.
 * descendingIterator(): Returns an iterator that has the reverse order for this deque.
 * push(element): Adds an element to the head.
 * pop(element): Removes an element from the head and returns it.
 * removeFirst(): Removes the element at the head.
 * removeLast(): Removes the element at the tail.
 */
public class DequeExample {

    public static void main(String[] args) {
        Deque deque = new LinkedList<String>();

        // We can add elements to the queue in various ways
        deque.add("Element 1 (Tail)"); // add to tail
        deque.addFirst("Element 2 (Head)");
        deque.addLast("Element 3 (Tail)");
        deque.push("Element 4 (Head)"); //add to head
        deque.offer("Element 5 (Tail)");
        deque.offerFirst("Element 6 (Head)");
        deque.offerLast("Element 7 (Tail)");

        System.out.println(deque + "\n");

        // Iterate through the queue elements.
        System.out.println("Standard Iterator");
        Iterator iterator = deque.iterator();
        while (iterator.hasNext()) {
            System.out.println("\t" + iterator.next());
        }

        // Reverse order iterator
        Iterator reverse = deque.descendingIterator();
        System.out.println("Reverse Iterator");
        while (reverse.hasNext()) {
            System.out.println("\t" + reverse.next());
        }

        // Peek returns the head, without deleting it from the deque
        System.out.println("Peek " + deque.peek());
        System.out.println("After peek: " + deque);

        // Pop returns the head, and removes it from the deque
        System.out.println("Pop " + deque.pop());
        System.out.println("After pop: " + deque);

        // We can check if a specific element exists in the deque
        System.out.println("Contains element 3: " + deque.contains("Element 3 (Tail)"));

        // We can remove the first / last element.
        deque.removeFirst();
        deque.removeLast();
        System.out.println("Deque after removing first and last: " + deque);
    }
}
