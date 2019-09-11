public class HexadecimalToInteger {
	public static void main(String[] args) {
		if(args.length < 1) {
			System.out.println("Invalid parameter");
		}
		else {
			try {
				System.out.println(Integer.decode("#" + args[0]));
			}
			catch(NumberFormatException e) {
				System.out.println("Error: " + args[0] + " is not an hexadecimal character.");
			}
		}
	}
}
