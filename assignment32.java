//Design a function to count the number of times the given number occurs in the given array.
class assignment32{
	public static void main(String[] args) {//calling method 
		System.out.println("main method starts");
		int len = 7;//variable to define the length of an array  
		int[] array = new int[len];//declare an array to give input
		int numerTocheck = 25;
		int num = 0; 
		array[0] = 10;//data insertion
		array[1] = 22;
		array[2] = 14;
		array[3] = 25;
		array[4] = 25;
		array[5] = 45;
		array[6] = 12;
		num = repeated(array,numerTocheck);//call a function and store its output inside another array 
		System.out.println("number of times repeated = "+num);//print the output 
		System.out.println("main method ends");
	}
	public static int repeated(int[] array,int numerTocheck) {//called method 
		System.out.println("repeated method starts");
		int num = 0;//to store the count of vowels
		for (int a =0; a<array.length; a++) {//check how many times number maches  
			if (array[a]==numerTocheck) {
				num++;
			}
		}System.out.println("repeated method ends");
		return num;
	}

}