// Design a function to return the volume of sphere and print it in main function.
class assignment16{
	public static void main(String[] args) {//calling method
		int radius = 5;
		System.out.println(volumeSphere(radius));// print volume of sphere 
	}
	public static double volumeSphere(int radius) {// called method 
		final double pi = 3.14159;
		double value = 4*pi*((radius*radius*radius)/3);//formulae for volume of sphere
		return value;
	}
}