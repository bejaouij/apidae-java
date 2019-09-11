public class ArrayInit {
	public static void main(String[] args) {
		int[] values = new int[100];

		java.util.Arrays.fill(values, 0, 20, 0);
		java.util.Arrays.fill(values, 20, 80, 2);
		java.util.Arrays.fill(values, 80, 100, 8);

		System.out.println(java.util.Arrays.toString(values));
	}
}
