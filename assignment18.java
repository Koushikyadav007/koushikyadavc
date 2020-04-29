//Write a Java method to find the smallest number among three numbers.
class assignment18{
	public static void main(String[] args) {
		System.out.println("main method starts");
		int number1 = 10;
		int number2 = 8;
		int number3 = 9;
		int smallest = 0;//variable to store smallest number  
		smallest = smallestNumber(number1,number2,number3);//saving the number into the variable 
		System.out.println(smallest);//print the smallest number 
		System.out.println("main method end");
	}
	public static int smallestNumber(int number1,int number2,int number3) {
		System.out.println("number method starts");
		int smallest = number1;//save the first number 
		if (smallest>number2) {//check if the first number is less than second number 
			smallest = number2;//if yes then store the second number 
		}
		else if (smallest>number3) {//check if the first number is less than third number 
			smallest = number3;//if yes then store the third number 
		}
		System.out.println("number method end");
		return smallest;//return smallest 
	}
}