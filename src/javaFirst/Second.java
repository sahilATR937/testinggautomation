package javaFirst;

public class Second {

	public int Sum(int a, int b) {
		int r = a + b;
		System.out.println(" Sum of the number is  " + r);
		return r;
	}

	public int Sub(int a1, int b1) {
		int r1 = a1 - b1;
		System.out.println(" Sub of the number is  " + r1);
		return r1;
	}

	public int mul(int a2, int b2) {
		int r2 = a2 * b2;
		System.out.println(" Mul of the number is  " + r2);
		return r2;
	}

	public int div(int a3, int b3) {
		int r3 = a3 / b3;
		System.out.println(" Div of the number is " + r3);
		return r3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Second x = new Second();
		int multiply = x.mul(10, 2);
		int add = x.Sum(multiply, 2);
		int subt = x.Sub(add, 2);
		int subt1 = x.Sub(subt, 2);
		x.div(subt1, 2);

	}

}

