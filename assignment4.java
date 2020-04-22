//write a program to print first 5 numbers which are not multiples of 2 and 5.
class Divisable3{
	public static void main(String[] args) {
		// while loop
		int i = 1;
		while(i<=5){
			if ((i%2)!=0){
				if ((i%5)!=0) {
					System.out.print(i+" ");
				}	
			}
			i++;
		}
		System.out.println("");
		// Do while loop
		int i1= 1;
		do{
			if ((i1%2)!=0){
				if ((i1%5)!=0) {
					System.out.print(i1+" ");
				}	
			}
			i1++;
		}while(i1<=5);
	}
}