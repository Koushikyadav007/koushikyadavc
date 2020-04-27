//Design a function to return the peremeter of cone and print it in main function. 
class assignment17{
	public static void main(String[] args) {//calling method 
		int radius = 10;
		int teta = 10;
		System.out.println(peremeterCone(radius,teta));// print the peremeter of cone
	}
	public static double peremeterCone(int radius, int teta) {// called method 
		double s = radius*teta;// multiple the radius and teta 
		double value = (2*radius)+s;// formulae for perimeter of cone 
		return value;
	}
}