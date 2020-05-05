//Design a function which will return a array of non repeating characters.
import java.util.Arrays;
class assignment38{
	public static void main(String[] args) {//calling method
	 	System.out.println("main method starts");
	 	String input = "koushikyadav";
	 	char[] output = new char[input.length()];//to store output
	 	output = nonRepeated(input);//call the method and store it in an array
	 	printer(output);
	 	System.out.println("main method starts");
	 }
	 public static char[] nonRepeated(String input) {
	 	char[] inputArray = input.toCharArray();
	 	for (int a = 0;a<inputArray.length ; a++) {
	 		for (int b = 0;b<inputArray.length ; b++) {
	 			if(inputArray[a]==inputArray[b]&&a!=b){//check repeated character 
	 				inputArray[b]='0';//to mark the character that is repeated 
	 			}
	 		}	
	 	}
	 	return inputArray;
	 }
	 public static void printer(char[] print) {//called method 
		System.out.println("priner method starts");
		for (int num = 0; num<print.length; num++) {//iterate all the elements in array
			if (print[num]!='0') {//to prevent the elimenated character
			  	System.out.print(print[num]);//print the array that is given as input
		   }  
		}
		System.out.println();//for next line 
		System.out.println("priner method ends");
	}
}