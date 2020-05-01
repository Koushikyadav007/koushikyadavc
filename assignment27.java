//design a function which takes an array of integers and return an new array with only even values in same positions and the odd ones replaced by 0.
class assignment27{
	public static void main(String[] args) {//calling method 
		System.out.println("main method starts");
		int len = 6;//variable to update length
		int[] array = new int[len];//declaration of array to give input
		int[] array1 = new int[len];//declaration of array to give output 
		array[0] = 0;//insertion 
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 8;
		array[5] = 7;
		array1=even(array);//call the method and store the output into another array 
		printer(array1);//print the array
		System.out.println("main method ends");
	}
	public static int[] even(int[] array) {//called method 
		System.out.println("even method starts");
		int len = array.length;//variable to store length of the array coming into actual argument 
		for (int a = 0; a<len; a++) {//iterate till all element are being checked 
			if (array[a]%2!=0) {//check if its even or not 
				array[a]=0;//if its odd then store zero inside it 
			}
		}
		System.out.println("even method ends");
		return array;
	}
	public static void printer(int[] print) {//called method 
		System.out.println("priner method starts");
		for (int num = 0; num<print.length; num++) {//iterate all the elements in array  
			System.out.print(print[num]);//print the array that is given as input
		}
		System.out.println();//for next line 
		System.out.println("priner method ends");
	}
}