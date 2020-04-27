// Design a function to return the area of trapizium and print it in main function.
class assignment14{
	public static void main(String[] args) {// calling method 
		int topLength = 10;
		int bottomLength = 19;
		int height = 10;
		System.out.println(areaTrapizium(topLength,bottomLength,height));// print area trapizium 
	}
	public static double areaTrapizium(int topLength,int bottomLength,int height) {// called method 
		double value = 0;
		value = (0.5)*height*(topLength+bottomLength);//formulae for area of trapizium
		return value;
	}
}