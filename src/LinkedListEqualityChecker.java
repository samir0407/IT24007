package src;
import java.util.*;

public class LinkedListEqualityChecker {
    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(1, 2, 3));
        LinkedList<Integer> list2 = new LinkedList<>(Arrays.asList(1, 2, 3));

        boolean isEqual = list1.equals(list2);
        System.out.println("Are LinkedLists equal? " + isEqual);
    }
}