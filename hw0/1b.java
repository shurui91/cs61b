/* Creative Exercise 1a: Drawing a Triangle */
public class Solution {
    public static void drawTriangle(int N) {
        String s = "*";
        for (int i = 1; i < N; i++) {
            String repeated = new String(new char[i]).replace("\0", s);
            System.out.print(repeated + "\n");
        }
    }

    public static void main(String[] args) {
        drawTriangle(10);
    }
}