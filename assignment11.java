//write a function to find the first 10 even square numbers.
class assignment11{
	public static void main(String[] args) {//calling method 
		square();//calling a functon 
	}

	public static void square() {//called method 
		int square;//tjis variable is to store square number
		for (int a = 1; a<=10; a++){//to iterate from 1 to 10
			square = a*a;// square numbers 
			if (square<=10) {// check if square number is present in range of 1 to 10 
				if (square%2==0) {// check if this is a even number
					System.out.print(square+" ");// print all the even square number in same line
					
				}
			}
		}
	}// this methods automatically gets returned by JVM
}