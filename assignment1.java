//programe to find number divisible by 5 from 1 to 10
class Divisable{
	public static void main(String[] args) {
		// while loop
		int i = 1;
		while(i<=10){
			if (i%5==0){
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println("");
		// Do while loop
		int i1= 1;
		do{
			if (i1%5==0) {
				System.out.print(i1+" ");
			}
			i1++;
		}while(i1<=10);
	}
}