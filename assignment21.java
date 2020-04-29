//Given a number from 1-7, return the name of the appropriate week.
class assignment21{
	public static void main(String[] args) {
		System.out.println("main method start");
		int i = 1;//month number
		week(i);// call the month method
		System.out.println("main method stop");
	}
	public static void week(int i) {
		System.out.println("week method start");
		switch (i) {// select the month according to the number 
			case 1:System.out.println("Mon");
					return;
			case 2:System.out.println("tue");
					return;
			case 3:System.out.println("wed");
					return;
			case 4:System.out.println("thu");
					return;
			case 5:System.out.println("fri");
					return;
			case 6:System.out.println("sat");
					return;
			case 7:System.out.println("sun");
					return;
			default:System.out.println("Invalid entry");// if the input is not inside the range 

		}
		System.out.println("week method stop");
	}
}
