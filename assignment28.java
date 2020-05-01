//design a function which will take an array as input and return an new array whith twice the size of original and the values copied twice in the new one.
class assignment28{
	public static void main(String[] args) {//calling method 
		System.out.println("main method starts");
		int len = 6;//variable to update length
		int[] array = new int[len];//declaration of array to give input
		int[] array1 = new int[len*2];//declaration of array to give output 
		array[0] = 0;//insertion 
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 8;
		array[5] = 7;
		array1=doubler(array);//call the method and store the output into another array 
		printer(array1);//print the array
		System.out.println("main method ends");
	}
	public static int[] doubler(int[] array) {
		System.out.println("even method starts");
		int index =0;//to keep the index count increasing for each for loop 
		int len = array.length;//variable to store length of the array coming into actual argument
		int[] array1 = new int[len*2];//declare the array to store the element in doubled arraylength  
		for (int a = 0; a<len; a++) {//iterate till all element are being transfered 
			array1[index]=array[a];//store the elements in second array from first array 
			index++;
		}
		for (int a = 0; a<len; a++) {//iterate again till all element are being transfered  
			array1[index]=array[a];//store the elements in second array from first array 
			index++; 
		}
		System.out.println("even method ends");
		return array1;		
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