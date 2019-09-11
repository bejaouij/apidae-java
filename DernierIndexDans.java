public class DernierIndexDans {
	public static void main(String args[]) {
		if(args.length != 2) {
			System.out.println("Invalid parameters");
		}
		else {
			System.out.println("The last \"" + args[1] + "\" in \"" + args[0] + " is at the position " + args[0].lastIndexOf(args[1]));
		}
	}
}
