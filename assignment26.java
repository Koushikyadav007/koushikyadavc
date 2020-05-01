//design a function which will take all your semisters percentages as input and create an array by storing them all with  decimal values.
import java.util.Arrays;
class assignment26{
	public static void main(String[] args) {//calling method 
		System.out.println("main method starts");
		int len = 5;//variable to update length
		int[] num = new int[len];//declaration of array to input
		double[] dec = new double[len];//declaration of array to store decimal output 
		num[0] = 55;//insertion 
		num[1] = 50;
		num[2] = 80;
		num[3] = 89;
		num[4] = 45;
		dec=intTodecimal(num);//call the method and store the output into array 
		printer(dec);//print the array 
		System.out.println("main method ends");
	}
	public static double[] intTodecimal(int[] num) {//called method 
		System.out.println("intTodecimal method starts");
		int len = num.length;//variable to store length of the array coming into actual argument 
		double[] dec = new double[len];//declare the array to support convertion 
		for (int i = 0; i<len; i++) {//iterate till all element are being converted 
			dec[i] = num[i];//converting int to decimal 	
		}
		System.out.println("intTodecimal method starts");
		return dec;
	}
	public static void printer(double[] print) {
		System.out.println("priner method starts");
		for (int num = 0; num<print.length; num++) {//iterate all the elements in array  
			System.out.print(print[num]);//print the array that is given as input
		}
		System.out.println();//for next line 
		System.out.println("priner method ends");
	}
}