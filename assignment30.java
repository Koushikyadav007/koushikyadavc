//Design a function to arrange the elements of the array in descending order.
class assignment30{
	public static void main(String[] args) {//calling method 
		System.out.println("main method starts");
		int len = 7;//variable to define the length of an array  
		int[] array = new int[len];//declare an array to give input
		int[] array1 = new int[len];//declare an array to store output 
		array[0] = 10;//data insertion
		array[1] = 22;
		array[2] = 14;
		array[3] = 25;
		array[4] = 25;
		array[5] = 45;
		array[6] = 12;
		array1=decending(array,len);//call a function and store its output inside another array 
		printer(array1);//print the array 
		System.out.println("main method ends");
	}
	public static int[] decending(int[] array,int len) {//called method
		int[] array1 = new int[len];//declare an array to return after operation is done
		// int[] arrayDone = new int[len];
		int i = 0;//to store the index of the smallest of the array 
		int large = 0;//to store the largest number in array 
		array1[0]=array[0];//initially store the first value to start iteration 
		for (int a=0;a<len ;a++ ) {
			for (int c=0;c<len;c++) {// iterate until you find the largest number
				if (array1[a]<array[c]) {
					array1[a]=array[c];
					i = c;
				}
			}
			array[i]=0;//once the largest number is found and copied make it 0
			System.out.println("decending method ends");

		}return array1;

	}
	public static void printer(int[] print) {//called method 
		System.out.println("priner method starts");
		for (int num = 0; num<print.length; num++) {//iterate all the elements in array  
			System.out.print(print[num]+" ");//print the array that is given as input
		}
		System.out.println();//for next line 
		System.out.println("priner method ends");
	}
}