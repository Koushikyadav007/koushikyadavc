//write a program to print first 10 numbers which are divsible by 3 and 6.
class Divisable1{
	public static void main(String[] args) {
		// while loop
		int i = 1;
		while(i<=10){
			if ((i%3)==0){
				if ((i%6)==0) {
					System.out.print(i+" ");
				}	
			}
			i++;
		}
		System.out.println("");
		// Do while loop
		int i1= 1;
		do{
			if ((i1%3)==0){
				if ((i1%6)==0) {
					System.out.print(i1+" ");
				}	
			}
			i1++;
		}while(i1<=10);
	}
}