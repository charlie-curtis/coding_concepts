package DataStructures;

import java.util.PriorityQueue;

public class myPriorityQueue {
  public static void main(String[] args) {
    PriorityQueue<Integer> queue = new PriorityQueue<>();

    queue.add(-13);
    queue.add(13);
    queue.add(12345);
    queue.add(1);
    Integer i;
    while ((i = queue.poll()) != null) {
      System.out.println(i);
    }
  }

}
