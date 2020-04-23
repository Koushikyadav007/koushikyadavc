class Assignment8{
	public static void main(String[] args) {
		int c= 0;
		for (int a = 0; a<3; a++ ) {
			for (int b=0; b<3; b++ ) {
				c++;
				if (c%2==0) {
					System.out.print("#");
				}
				else {
						System.out.print("$");
				}	
			}
			System.out.println("");
		}
		int row=0;
		int column=0;
		c=0;
		while(row<3) {
			column=0;
			while(column<3) {
				c++;
				if (c%2==0) {
					System.out.print("#");	
				}
				else {
						System.out.print("$");
				}	
				column++;	
			}
			row++;
			System.out.println("");
		}
	}

}