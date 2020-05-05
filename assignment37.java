//Design a function which will take two STrings as an input ad return true if they are same else returns false.
class assignment37{
	public static void main(String[] args) {//calling method
	 	System.out.println("main method starts");
	 	String input = "koushikyadav";
	 	String input1 = "koushikyadav";
	 	boolean output = false;//to store output
	 	output = equality(input,input1);//call the method and store the output inside a variable
	 	System.out.println("Are both Strings equal "+output);//print output
	 	System.out.println("main method starts");
	 }
	 public static boolean equality(String input, String input1) {//called method
	 	boolean output = false;//store the output
	 	output = input.equals(input1);//check for equality
	 	return output;
	 }
}