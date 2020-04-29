//Given a number from 1-12, return the name of the appropriate month.
class assignment20{
	public static void main(String[] args) {
		System.out.println("main method start");
		int i = 1;//month number
		month(i);// call the month method
		System.out.println("main method stop");
	}
	public static void month(int i) {
		System.out.println("month method start");
		switch (i) {// select the month according to the number 
			case 1:System.out.println("Jan");
					return;
			case 2:System.out.println("Feb");
					return;
			case 3:System.out.println("Mar");
					return;
			case 4:System.out.println("Apr");
					return;
			case 5:System.out.println("May");
					return;
			case 6:System.out.println("Jun");
					return;
			case 7:System.out.println("Jul");
					return;
			case 8:System.out.println("Aug");
					return;
			case 9:System.out.println("Sep");
					return;
			case 10:System.out.println("Oct");
					return;
			case 11:System.out.println("Nov");
					return;
			case 12:System.out.println("Dec");
					return;
			default:System.out.println("Invalid entry");// if the input is not inside the range 

		}
		System.out.println("month method stop");
	}
}
