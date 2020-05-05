//Design a function which will return a character value specified at the given input index.
class assignment34{
	 public static void main(String[] args) {//calling method
	 	System.out.println("main method starts");
	 	String input = "koushikyadav";
	 	int num = 8;//the index to be found 
	 	char output =' ';//variable to store output 
	 	output = find(input,num);//call function and store char into variable
	 	System.out.println("The character at this index is "+output);
	 	System.out.println("main method starts");
	 }
	 public static char find(String input,int num) {//called method
	 	System.out.println("find method starts");
	 	char letter = ' ';//to store and return character in the specified index
	 	if ((num<input.length())&&num>=0) {//this is to avoid index which are out of boundry 
	 		letter = input.charAt(num);
	 	}
	 	else {
	 		letter = '-';//if the index is out of range this character will get printed 
	 	}
	 	System.out.println("find method end");
	 	return letter;
	 }

}