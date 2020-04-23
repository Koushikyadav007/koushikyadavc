class assignment7{
	public static void main(String[] args) {
		int c= 10;
		for (int a = 0; a<3; a++ ) {
			for (int b=0; b<3; b++ ) {
				c--;
				System.out.print(c);	
			}
			System.out.println("");
		}
		int row=0;
		int column=0;
		c=10;
		while(row<3) {
			column=0;
			while(column<3) {
				c--;
				System.out.print(c);
				column++;	
			}
			row++;
			System.out.println("");
		}
	}
}