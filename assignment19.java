//Write a Java method to compute the average of three numbers, return true if the average is even else return false.
class assignment19{
	public static void main(String[] args) {
		System.out.println("main method starts");
		int number1 = 10;
		int number2 = 8;
		int number3 = 9;
		boolean average = false;//variable to store output  
		average = averageNumber(number1,number2,number3);//clalling a method and aslo saving the outupt of metthod into the variable 
		System.out.println(average);//print output 
		System.out.println("main method end");
	}
	public static boolean averageNumber(int number1,int number2,int number3) {
		System.out.println("number method starts");
		boolean value = false;
		int number = number1+number2+number3;//add all the three number 
		int average = number/3;//divide it by 3 to get the average 
		if (average%2==0) {// to check if the average is odd or even 
			value = true;
		}
		System.out.println("number method end");
		return value;//return average number 
	}
}