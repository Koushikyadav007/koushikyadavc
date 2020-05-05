//Design a function which will count the number of vowels in  the given string.
class assignment36{
	public static void main(String[] args) {//calling method
	 	System.out.println("main method starts");
	 	String input = "koushikyadav";
	 	int output =0;
	 	output = find(input);//call the method and store the output in a variable 
	 	System.out.println("Number of vowels in input "+output);//print output
	 	System.out.println("main method starts");
	 }
	 public static int find(String input) {//called method
	 	System.out.println("find method starts");
	 	int vowels = 0;//to store vowel count 
	 	for (int a =0; a<input.length(); a++) {//check for vowel and increament variable if it encounters vowel
	 		switch(input.charAt(a)){
	 			case('a'):vowels++;
	 						break;
	 			case('e'):vowels++;
	 						break;
	 			case('i'):vowels++;
	 						break;
	 			case('o'):vowels++;
	 						break;
	 			case('u'):vowels++;
	 						break;
	 			default:break;
	 		}
	 	}
	 	System.out.println("find method end");
	 	return vowels;
	 }
}