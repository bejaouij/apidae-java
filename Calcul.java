public class Calcul {
	public static void main(String[] args) {
		float operand1, operand2, res = -1;
		
		if(args.length != 3) {
		       System.out.println("Invalid parameters");
		}
 		else {
			boolean isInvalidOperator = false;

			operand1 = Float.parseFloat(args[0]);
			operand2 = Float.parseFloat(args[2]);

			switch(args[1]) {
				case "+":
					res = operand1 + operand2;
					break;
				case "-":
					res = operand1 + operand2;
					break;
				case "*":
					res = operand1 * operand2;
					break;
				case "/":
					res = operand1 / operand2;
					break;
				default:
					isInvalidOperator = true;
			}

			if(!isInvalidOperator) {
				System.out.println(operand1 + " " + args[1] + " " + operand2 + " = " + res);
			}
			else {
				System.out.println("Invalid operator");
			}
		}
	}
}
