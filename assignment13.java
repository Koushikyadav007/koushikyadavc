//Design a function to return the area of square and print it in main function.
class assignment13{
	public static void main(String[] args) {//calling method 
		int length = 10;
		int breadth = 10;
		System.out.println(areaSquare(length,breadth));//pint the area of square 
	}
	public static int areaSquare(int length, int breadth) {// called method 
		int value = 0;
		value = length*breadth;// formulae for area of square 
		return value;
	}
}