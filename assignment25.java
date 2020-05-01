//design a function which accepts an array of charecters and returns an array with the reverse characters.
import java.util.Arrays;
class assignment25{
	public static void main(String[] args) {// calling method 
		System.out.println("main method starts");
		int len = 3;
		char[] array = new char[len];//array decelaration for input 
		char[] print = new char[len];//array decelaration for storing the output
		array[0] = 'b';//insertion
		array[1] = 'h';
		array[2]= 'k';
		print = reverse(array);//calling a method and saving output inside another array
		printer(print);// calling another method to print the output from reverse method 
		System.out.println("main method ends");
	}
	public static char[] reverse(char[] array) {//called method
		System.out.println("reverse method starts");
		int len = array.length;//variable to store the length of an array which will be constant throughout program
		int len1 = len;//variable to store the length of an array will be used by reverse operation
		char[] store = new char[len];//new decleration of array which stores reverse order of an array 
		for (int num = 0; num<len; num++) {//iterate until reversal of all the elements present in an array occurs  
			--len1;//reduced by one as length is natural number but index is a whole number 
			store[len1] = array[num];//store the value in reverse order 
		}
		System.out.println("reverse method ends");
		return store;
	}
	public static void printer(char[] print) {
		System.out.println("priner method starts");
		for (int num = 0; num<print.length; num++) {//iterate all the elements in array  
			System.out.print(print[num]);//print the array that is given as input
		}
		System.out.println();//for next line 
		System.out.println("priner method ends");
	}
}