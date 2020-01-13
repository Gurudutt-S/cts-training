import java.util.PriorityQueue;

public class Pqueue {

	public static void main(String[] args) {
		PriorityQueue<Integer> set = new PriorityQueue<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		System.out.println(set.peek());
		System.out.println(set.poll());
		System.out.println(set.element());
	}


}
