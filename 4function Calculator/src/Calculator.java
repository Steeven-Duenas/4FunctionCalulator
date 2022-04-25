
public class Calculator {
	private double total;

	public Calculator(double total) {
		super();
		this.total = total;
	}
	public void Addition(double x) {
		total = total +x;
	}

	public void Division(double x) {
		total = total / x;
	}

	public double getTotal() {
		return total;
	}
	public void Multiplication(double x) {
		total = total *x;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	public void Subtraction(double x) {
		total = total - x;
	}
	
	
	
}
