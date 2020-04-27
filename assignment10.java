//write a function to find the even multiples of 5&7 between 10 and 100.
class assignment10{
	public static void main(String[] args) {// calling method
		multiples();// calling a function
	}
	public static void multiples(){// called method 
		for (int a = 10; a<=100; a++ ) {// to iterate from 10 to 100
			if (a%2==0) {// check if variable a is even number
				if (a%5==0) {// check if variable a is multiple of 5
					if (a%7==0) {// check if variable a is multiple of 7
						 System.out.print(a+" ");//print if all the contitions gets passed 
				      }
			    }
		    }
		}
	}// this methods automatically gets returned by JVM
}