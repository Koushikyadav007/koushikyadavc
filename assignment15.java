// Design a function to return the surfacearea of cylinder and print it in main function.
class assignment15{
	public static void main(String[] args) {// calling method 
		int radius =10;
		int height = 10;
		System.out.println(surfaceareaCylinder(radius,height));//print surface area of cylinder
	}
	public static double surfaceareaCylinder(int radius, int height) {// called method 
		final double pi2 = 3.14159*2;// fixed value pi * 2
		double value = (pi2*radius*height)+(pi2*(radius*radius));// formulae of surface area of cylinder 
		return value;
	}
}