import java.util.*;

// Problem Statement #
// Given an unsorted array of numbers, find the ‘K’ largest numbers in it.
// Example 1:

// Input: [3, 1, 5, 12, 2, 11], K = 3
// Output: [5, 12, 11]

class Main {

  public static int findKLargestNumbers(int[] nums) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

    // put first 'k' numbers in min heap
    for (int i = 0; i < nums.length; i++)
      minHeap.add(nums[i]);

    int temp = 0, result = 0;
    
    while (minHeap.size() > 1){
      temp = minHeap.poll() + minHeap. poll();
      result +=  temp;
      minHeap.add(temp);
    }

    return result;

  }


  public static void main(String[] args) {

    int result = Main.findKLargestNumbers(new int[] { 3, 1, 5, 12, 2, 11 });
    System.out.println("K largest numbers" + result);

  }
}