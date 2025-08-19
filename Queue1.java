import java.util.Queue;
import java.util.LinkedList;
public class Queue1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Front: " + queue.peek());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());
        System.out.println("Queue now: " + queue);
    }
}
