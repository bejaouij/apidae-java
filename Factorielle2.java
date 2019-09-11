public class Factorielle2 {
	public static void main(String[] args) {
		int n;
		int res;

		if(args.length > 0) {
			n = Integer.parseInt(args[0]);
			
			if(n <= 1) {
				res = 1;
			}
			else {
				res = n;

				for(int i = (n-1); i > 1; i--) {
					res = res * i;
				}
			}

			System.out.println(n + "!: " + res);
		}
		else {
			System.out.println("Empty n argument");
		}
	}
}
