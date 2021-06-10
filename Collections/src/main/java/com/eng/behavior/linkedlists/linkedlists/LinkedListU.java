package com.eng.behavior.linkedlists.linkedlists;

/**
 * Created by enginoz on 14.12.2017.
 */
public class LinkedListU<T> {

    Node head;

    public LinkedListU() {
        head = null;
    }

    public void add(Object value) {
        Node newNode = new Node(value, null);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete() {
        head = head.next;
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.println((T) n.value);
            n = n.next;
        }
    }


    private class Node {
        Object value;
        Node next;

        public Node(Object value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
