public class Solution {
	public static void main(String[] args) {
		String s = "*";
		for (int n = 1; n < 6; n++) {
			String repeated = new String(new char[n]).replace("\0", s);
			System.out.print(repeated + "\n");
		}
	}
}