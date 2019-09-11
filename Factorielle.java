public class Factorielle {
	public static void main(String[] args) {
		int n = 1;
		int res = n;

		for(int i = (n-1); i > 1; i--) {
			res = res * i;
		}

		System.out.println("5!: " + res);
	}
}
