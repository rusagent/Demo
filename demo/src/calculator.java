
public class calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Bitte ihre Rechenmethode eingeben");

	}
	
	private double calculate(int state, double a, double b){
		double result;
		switch (state) {
		case 1:
			result = add(a,b);
			break;

		case 2:
			result = substract(a,b);
			break;
		case 3:
			result = multiply(a,b);
			break;
		case 4:
			result = divide(a,b);
			break;
		default:
			result = 0;
			break;
		}
		
		return result;
	}

	
	private double add (double a, double b){
		return a+b;
	}
	private double substract(double a, double b){
		return a-b;
	}
	private double divide(double a, double b){
		if(b != 0){
			return a/b;
		}
		return 0;
	}
	private double multiply (double a, double b){
		return a*b;
	}
}
