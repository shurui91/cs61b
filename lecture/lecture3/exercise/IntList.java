/** Defines a recursive list of integers.
 *  @author Josh Hug
 */

public class IntList {
	public int head;
	public IntList tail;

	public IntList(int h, IntList t) {
		head = h;
		tail = t;
	}

	/** Returns the size of this IntList */
	public int size() {
		if (tail == null) {
			return 1;
		}
		return 1 + tail.size();
	}

	/** Returns the size of this IntList. */
	public int iterativeSize() {
		IntList p = this;
		int size = 0;
		while (p != null) {
			size += 1;
			p = p.tail;
		}
		return size;
	}

	/** In class exercise 1: 
	  * Returns ith item of this IntList. For 
	  * simplicity, assume the item exists. */
	public int get(int i) {
		if (i == 0) {
			return head;
		}
		return tail.get(i - 1);
	}

	public String toString() {
		// if there is only one element
		if (tail == null) {
			return Integer.toString(head);
		}
		// if there is more than one element
		return Integer.toString(head) + " " + tail.toString();
	}

	/** Returns an IntList identical to L, but with
	  * each element incremented by x. L is not allowed
	  * to change. */
	public static IntList incrList(IntList L, int x) {
		if (L == null) {
			return null;
		}
		IntList incrementedList = new IntList(L.head + x, null);
		incrementedList.tail = incrList(L.tail, x);
		return incrementedList;
	}

	/** Returns an IntList identical to L, but with
	  * each element incremented by x. Not allowed to use
	  * the 'new' keyword. */
	public static IntList dincrList(IntList L, int x) {
		if (L == null) {
			return null;
		}
		L.head = L.head + x;
		/* Don't actually care about the return value here. */
		dincrList(L.tail, x);
		return L;
	}

	public static void main(String[] args) {
		IntList L = new IntList(5, null);
		L.tail = new IntList(7, null);
		L.tail.tail = new IntList(9, null);

		System.out.print("L.size() is ");
		System.out.println(L.size());
		System.out.print("L.iterativeSize() is ");
		System.out.println(L.iterativeSize());
		System.out.print("L is ");
		System.out.println(L);

		// Test your answers by uncommenting. Or use the Visualizer.
		System.out.print("get(1) is ");
		System.out.println(L.get(1));
		System.out.print("incrList(L, 3) is ");
		System.out.println(incrList(L, 3));
		System.out.print("dincrList(L, 3) is ");
		System.out.println(dincrList(L, 3));        
	}
} 