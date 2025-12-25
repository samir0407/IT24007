package src;
import java.util.*;

public class CustomQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(2);
        queue.add(8);

        while (!queue.isEmpty()) {
            System.out.println("Queue Element: " + queue.poll());
        }
    }
}