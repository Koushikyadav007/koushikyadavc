class assignment23{
	public static void main(String[] args) {
		arrayWithdataTypes();
	}
	public static void arrayWithdataTypes(){
		byte[] array1= {1,2,3,4,5,6};
		short[] array2 ={10000,10500,20000,20500};
		int[] array3 = {123456789,65582,8683,87454,233541,3553654};
		long[] array4 ={68467474,989875,656654,547644,5444484};
		float[]	array5 ={0.123f,0.454548f,0.3882f};
		double[] array6 ={0.6523d,0.89169d,0.388487d,0.3815d};
		char[] array7 ={'k','o','u','s','h','i','k'};
		boolean[] array8 ={true,false,true};
		for (long num : array1) {
			System.out.print(num);	
		}
		System.out.println();
		for (long num : array2) {
			System.out.print(num);	
		}
		System.out.println();
		for (long num : array3) {
			System.out.print(num);	
		}
		System.out.println();
		for (long num : array4) {
			System.out.print(num);	
		}
		System.out.println();
		for (float num : array5) {
			System.out.print(num);	
		}
		System.out.println();
		for (double num : array6) {
			System.out.print(num);	
		}
		System.out.println();
		for (char num : array7) {
			System.out.print(num);	
		}
		System.out.println();
		for (boolean num : array8) {
			System.out.print(num);	
		}
		System.out.println();
	}
}