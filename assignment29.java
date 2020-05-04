//Design a function to arrange the elements of the array in ascending order.
class assignment29{
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
		array1=ascending(array,len);//call a function and store its output inside another array 
		printer(array1);//print the array 
		System.out.println("main method ends");
	}
	public static int[] ascending(int[] array,int len) {//called function 
		System.out.println("ascending method starts");
		int[] array1 = new int[len];//declare an array to return after operation is done
		// int[] arrayDone = new int[len];
		int i = 0;//to store the index of the smallest of the array 
		int large = 0;//to store the largest number in array 
		array1[0]=array[0];
		for (int c=0;c<len;c++) {//find the largest num in array 
			if (array1[0]<array[c]) {
				array1[0]=array[c];
			}
		}
		large = array1[0];//store largest number to start comparision
		for (int b=0; b<len; b++) {
			array1[b] = large;//in each iteration start comparing the number to largest first 
			for (int a = 0; a<len; a++) {//iterate and store lowest number into a bucket 
				if (array1[b]>array[a]&&array[a]!=-1) { 
					array1[b] = array[a];
					i = a;//store the index 

				}
			}
			array[i]=-1;//make value in stored index to -1 so as to ignore this value
			System.out.println("ascending method ends");  
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