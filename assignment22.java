//Write a function which returns a true if the sum of the numbers with in the range is even else return false.
class assignment22{
	public static void main(String[] args) {
		System.out.println("main method starts");
		int lowerRange = 0;
		int upperRange = 11;
		boolean even = false;//variable to store output  
		even = sum(lowerRange,upperRange);//clalling a method and aslo saving the outupt of metthod into the variable 
		System.out.println(even);//print output 
		System.out.println("main method end");
	}
	public static boolean sum(int number1,int number2) {
		System.out.println("number method starts");
		boolean value = false;
		int sum = 0;
		for (int a =number1; a<=number2 ; a++) {// to iterate over the range given 
		 	sum += a;// to add all the numbers within the range  
		 } 
		if (sum%2==0) {// to check if the sum is odd or even
			value = true;
		}
		System.out.println("number method end");
		return value;//return average number 
	}
}