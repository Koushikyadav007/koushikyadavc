//design a function to which accepts a array of integrs and returns its average value.
class assignment24{
	public static void main(String[] args) {//calling method 
		System.out.println("main method starts");
		int[] array = new int[3];//array declaration 
		array[0] = 10;//data insertaion
		array[1] = 20;
		array[2] = 30;
		int num = average(array);//call the method and store the output into the variable 
		System.out.println(num);//print the variable
		System.out.println("main method ends");
	}
	public static int average(int[] array) {//called method 
		System.out.println("average method starts");
		int average = 0;//variable to hold the average 
		for (int num = 0; num<array.length ; num++) {//iterate over array length and keep adding all the index inside array
				average += array[num];//adding all the values in array 
		}
		System.out.println("average method ends");	
		return average/array.length;//divide the total sum by arraylength and return it	
	}
}