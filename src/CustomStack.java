package src;
import java.util.*;

public class CustomStack {
    public static void main(String[] args) {
        PriorityQueue<Integer> stack = new PriorityQueue<>(Collections.reverseOrder());
        stack.add(5);
        stack.add(2);
        stack.add(8);

        while (!stack.isEmpty()) {
            System.out.println("Stack Element: " + stack.poll());
        }
    }
}