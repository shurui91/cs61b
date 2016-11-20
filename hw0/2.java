/* Exercise 2 */
public class Solution {
	public static int max(int[] m) {
		int a = m[0];
		for (int i = 1; i < m.length; i++) {
			if (a < m[i]) {
			a = m[i];
			}
		}
		return a;
	}
	
	public static void main(String[] args) {
		int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
		System.out.println(max(numbers));
	}
}