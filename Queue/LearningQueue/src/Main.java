import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<String>(); // Cannot use queue because actually it is an interface, we use
                                                        // a clas derive from it which is linked list
        System.out.println(queue.isEmpty());
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");
        System.out.println(queue.isEmpty());
        System.out.println(queue.peek());
        System.out.println(queue);

        System.out.println(queue.contains("Karen"));
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        System.out.println(queue);

    }

}
