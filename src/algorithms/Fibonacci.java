package algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		int fib = 0;
		int ona = 1;
		int cci = fib + ona;
		System.out.println(fib);
		System.out.println(ona);
		for (int i = 0; i < 11; i++) {
			cci = fib + ona;
			fib = ona;
			ona = cci;
			System.out.println(cci);
		}	
	}
}
