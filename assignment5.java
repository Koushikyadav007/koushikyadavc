//write a program to print first 15 numbers which are multiples of 7 but not divisible by 9.
class Divisable4{
	public static void main(String[] args) {
		// while loop
		int i = 1;
		while(i<=15){
			if ((i%7)==0){
				if ((i%9)!=0) {
					System.out.print(i+" ");
				}	
			}
			i++;
		}
		System.out.println("");
		// Do while loop
		int i1= 1;
		do{
			if ((i1%7)==0){
				if ((i1%9)!=0) {
					System.out.print(i1+" ");
				}	
			}
			i1++;
		}while(i1<=15);
	}
}