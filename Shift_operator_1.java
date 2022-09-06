package Programs;

public class Shift_operator_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte n=6;
		byte n2=-6;
		byte n3=-8;
		//int answer=n<<2;
		System.out.println("The right shift "+(n>>2));//right shift :
		//shift the values and delete the last two bits
		System.out.println("The left shift "+(n<<2));
		//
		System.out.println("The left shift "+(n2>>>2));
		System.out.println("The right shift "+(n3>>2));//signed right shift
		System.out.println("The right shift "+(n3>>>2));//unsigned right shift
		
	}

}
