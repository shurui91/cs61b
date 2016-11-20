/* Exercise 2 */
public class Solution {
	public static int max(int[] m) {
		Array sorted = Array.sort(m);
		int length = m.length;
		int max_value = m[length - 1];
		System.out.println(max_value);
	}

	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		max(numbers);
	}
}