package nested_loops;

public class ForLoopGauntlet {

	public static void main(String[] args) {
		//all numbers from 0 - 100
		for (int a = 0; a < 101; a++) {
			System.out.println(a);
		}
		//all numbers from 100 - 0
		for (int b = 100; b > 0; b--) {
			System.out.println(b);
		}
		//all even numbers from 2 - 100
		for (int c = 2; c < 101; c+=2) {
			System.out.println(c);
		}
		//all odd numbers from 1 - 99
		for (int d = 1; d < 100; d+=2) {
			System.out.println(d);
		}
		//all numbers from 1 - 500 with "is odd" or "is even"
		for (int e = 1; e < 501; e++) {
	
			if (e%2==0) {
				System.out.println(e + " is even");
			}
			else {
				System.out.println(e + " is odd");
			}
		}
		//all multiples of 7 from 0 - 777
		for (int f = 0; f < 778; f++) {
			if (f%7==0) {
				System.out.println(f);
			}
		}
		//all the years I was alive with my age in each
		int h = 0;
		for (int g = 2005; g < 2019; g++) {
			System.out.println("In " + g + ", I was " + h + " years old.");
			h += 1;
		}
		//nested for loop #1
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(i);
				System.out.println(j);
			}
		}
		//nested for loop #2
		for (int k = 1; k < 10; k+=3) {
			for (int l = 0; l < 3; l++) {
				System.out.print(k + l);
			}
			System.out.println();
		}
	}
	
}
