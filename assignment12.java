//write a function to find the odd qube numbers between 1 and 50.
class assignment12{
	public static void main(String[] args) {//calling method 
		oddCube();// calling a function
	}
	public static void oddCube() {// called method
		int cube;
		for (int a=1; a<=50; a++) {// iterate from 1 to 50
			cube = a*a*a;
			if(cube<50){// check if cube is present inside the range of 1 to 50
				if (cube%2 != 0) {//check if the cube is a odd number
					System.out.print(cube+" ");//print the odd cube number
				}
			}
		}
		
	}// this methods automatically gets returned by JVM
}