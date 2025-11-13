package LinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();// doubly linkedlist
        /*
         * linkedList.push("A");
         * linkedList.push("B");
         * linkedList.push("C");
         * linkedList.push("D");
         * linkedList.push("F");
         * linkedList.pop();
         */
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("A");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll();
        linkedList.add(1, "E");
        linkedList.remove("E");
        // System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("P");
        linkedList.addLast("T");
        String first = linkedList.removeFirst();
        String second = linkedList.removeLast();
        System.out.println(linkedList);

    }
}
