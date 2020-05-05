//Design a function which will return a String which is reverse of the input string.
class assignment35{
	 public static void main(String[] args) {//calling method
	 	System.out.println("main method starts");
	 	String input = "vadaykihsuok";
	 	String  output ="";
	 	output = find(input);//call the method and store it in variable
	 	System.out.println("The character at this index is "+output);//print output
	 	System.out.println("main method starts");
	 }
	 public static String find(String input) {
	 	System.out.println("find method starts");
	 	int len = input.length();//to store length 
	 	String  output ="";
	 	char[] reverse = new char[len];//to store the reversed char array 
	 	char[] inputArray = input.toCharArray();//convert string to character array
	 	for (int a = 0; a<inputArray.length; a++ ) {//reversing character array 
	 		len--;
	 		reverse[len] = inputArray[a];
	 	}
	 	for (int a = 0; a<inputArray.length;a++ ) {//converting character array into string 
	 		output += reverse[a];
	 	}
	 	System.out.println("find method end");
	 	return output;
	 }

}