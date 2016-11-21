public class IntList {
	public int head;
	public IntList tail;

	/* define a list constructor, recursion style */
	public IntList(int h, IntList t) {
		head = h;
		tail = t;
	}

	/** Returns the size of this IntList */
	public int size() {
		/** if tail is empty, means there is only one element in the list */
		if (tail == null) {
			return 1;
		}
		// or the length is 1 + tail.size()
		return 1 + tail.size();
	}

	/** RIterate the whole linked list */
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
		// .get works for things like arrayList in Java (maybe)
		return tail.get(i - 1);
	}

	public static void main(String[] args) {
		IntList L = new IntList(5, null);
		L.tail = new IntList(7, null);
		L.tail.tail = new IntList(9, null);

		System.out.println(L.size());
		System.out.println(L.iterativeSize());
	}
} 