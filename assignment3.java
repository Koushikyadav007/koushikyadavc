//write a program to print first 5 numbers which are not multiples of 4
class Divisable2{
	public static void main(String[] args) {
		// while loop
		int i = 0;
		while(i<=5){
			if (i%4!=0){
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("");
		// Do while loop
		int i1= 0;
		do{
			if (i1%4!=0) {
				System.out.print(i1+" ");
			}
			i1++;
		}while(i1<=5);
	}
}