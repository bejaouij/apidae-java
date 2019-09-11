public class TermineAvec {
	public static void main(String args[]) {
		if(args.length != 2) {
			System.out.println("Invalid parameters");
		}
		else {
			if(args[0].endsWith(args[1])) {
				System.out.println(args[0] + " properly finishs by " + args[1]);
			}
			else {
				System.out.println(args[0] + " does not finish by " + args[1]);
			}
		}
	}
}
