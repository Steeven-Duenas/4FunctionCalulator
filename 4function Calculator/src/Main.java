import java.util.Scanner;

public class Main {
	public static double checkNumber(double number) throws DivisionByZeroException{
		if(number ==0 ) {
			throw new DivisionByZeroException();
		}
		else {
			return number;
		}
	}
	public static char checkOperator(char Operator) throws UnknownOperatorException{
		switch (Operator) {
		case '+': /*fallthrough*/
		case '-':
		case '/': 
		case '*':return Operator;
		default:
			throw new UnknownOperatorException();

		}
	}
	public static void main(String[] args) {
		boolean calculatorOnOff1 = false;
		char Operator = '+';
		double number=0;
		
		Scanner keyboard =new Scanner(System.in);
		Calculator myCalculator = new Calculator(0);
		
		while(!calculatorOnOff1)
		{
			boolean skip = false;
			//Calculator Options
			System.out.println("Result: " + myCalculator.getTotal());
			System.out.println("Enter Operation: ");
			Operator = keyboard.next().charAt(0);
			switch(Operator) {
			case 'r':
			case 'R':System.out.println("Again?");Operator = keyboard.next().charAt(0);
				     if(Operator == 'y') {number = 0;skip = true;}else{System.out.println("The total is: " +myCalculator.getTotal());
				     System.out.println("End Of Program");System.exit(0);}
			}
			if(!skip) {
				}
				System.out.println("Enter Number: ");
				number = keyboard.nextDouble();
				keyboard.nextLine(); // Empty the buffer
				//Calculator Options
				switch(Operator) {
				case '+': myCalculator.Addition(number);break;
				case '-': myCalculator.Subtraction(number);break;
				case '*': myCalculator.Multiplication(number);break;
				case '/': try{checkNumber(number);myCalculator.Division(number);}catch (DivisionByZeroException E) {System.out.println(E.getMessage());}break;
				//.......
				}
				try {
					checkOperator(Operator);
				}
				catch(UnknownOperatorException F) {
					System.out.println(F.getMessage());
				}
			}
		keyboard.close();
		}
}
