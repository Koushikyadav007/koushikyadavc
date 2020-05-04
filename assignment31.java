//Design a function to count the number of vowels in the given array.
class assignment31{
	public static void main(String[] args) {//calling method 
		System.out.println("main method starts");
		int len = 7;//variable to define the length of an array  
		char[] array = new char[len];//declare an array to give input
		int num = 0; 
		array[0] = 'a';//data insertion
		array[1] = 'b';
		array[2] = 'c';
		array[3] = 'd';
		array[4] = 'e';
		array[5] = 'f';
		array[6] = 'i';
		num = vowels(array,len);//call a function and store its output inside another array 
		System.out.println("number of vowels = "+num);//print the output 
		System.out.println("main method ends");
	}
	public static int vowels(char[] array,int len) {//called method 
		System.out.println("vowels method starts");
		int num = 0;//to store the count of vowels
		for (int a =0; a<len; a++) {//check how many vowels are there by incrementing num for every encounter of vowels 
			switch(array[a]){
				case('a'):num++;
						  break;
			    case('e'):num++;
						  break;
				case('i'):num++;
						  break;
				case('o'):num++;
						  break;
				case('u'):num++;
						  break;
				default:  break;
			}
		}System.out.println("vowels method ends");
		return num;
	}
}