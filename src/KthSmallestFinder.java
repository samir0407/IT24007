package src;
import java.util.*;

public class KthSmallestFinder {
    public static int findKthSmallest(List<Integer> list, int k) {
        Collections.sort(list);
        return list.get(k - 1); // kth smallest means index k-1
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(7, 2, 9, 4, 1);
        int k = 4;
        System.out.println("Kth smallest: " + findKthSmallest(numbers, k));
    }
}