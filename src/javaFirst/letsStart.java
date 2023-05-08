package javaFirst;

public class letsStart { // Boundary of the class

	int rollNumber = 12; // created the 1 variables and store value
	int ageOfStudent = 22; // created the 2 variables and store value

	public void display1() { // Boundary of the class
		System.out.println("---> Lets Start Automation Learning <---");

	}

	public void display2() { // Boundary of the class

		System.out.println("---> Because Automation is Easy <---");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		letsStart a = new letsStart(); // created the object of the letsStart class

		a.display1(); // call the methods 1
		a.display2(); // call the methods 2

		System.out.println("Age of Student One is = " + a.ageOfStudent);
		System.out.println("Roll Number of Student One is = " + a.rollNumber);

		a.ageOfStudent = 25; // assign new value to the 1st variable
		a.rollNumber = 17; // assign new value to the 2nd variable

		System.out.println("Age of Student Two is = " + a.ageOfStudent);
		System.out.println("Roll Number of Student Two is = " + a.rollNumber);

	}

}

