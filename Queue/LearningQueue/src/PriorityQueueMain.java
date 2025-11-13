import java.util.Queue;

public class PriorityQueueMain {
    public static void main(String[] args) {
        // Queue<Double> queue = new
        // java.util.PriorityQueue<>(Collections.reverseOrder());// Change to new
        // PriorityQueue

        // queue.offer(3.0);
        // queue.offer(2.5);
        // queue.offer(3.1);
        // queue.offer(5.0);
        // queue.offer(2.0);

        // while (!queue.isEmpty()) {
        // System.out.println(queue.poll());
        // }
        Queue<String> queue = new java.util.PriorityQueue<>();// Bình thường nó sẽ là ascending, dùng
                                                              // Collections.reverseOrder() thì nó sẽ tăng dần

        queue.offer("B");
        queue.offer("F");
        queue.offer("E");
        queue.offer("D");
        queue.offer("A");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
