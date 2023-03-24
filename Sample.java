package exceptionHandling;

public class Sample {
	static void display(String s, int no) {
		int x = Integer.parseInt(s);
		int y = no/x;
		System.out.println(y);
	}
	public static void main(String[] args) {
		int[] a = new int[10];
		String s = "abcd";
		try {
			
			display("00a", 100);
			
		}catch(NumberFormatException e) {
			System.out.println("Please enter a valid string");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
