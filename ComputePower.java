package assignment1;

import algs4.StdIn;
import algs4.StdOut;
/*Anh Nguyen*/
public class ComputePower {
	public static long power(int i, int j) {
		if (j == 0) {
			return 1;
		}
		return i * power(i, j-1);
	}
	public static void main(String[] args) {
		StdOut.print("Enter the number you want to use as a base: ");
		int a = Integer.parseInt(StdIn.readLine());
		StdOut.print("Enter the number you want to use as an exponent: ");
		int b = Integer.parseInt(StdIn.readLine());
		StdOut.printf("The answer is %,d .", power(a, b));
	}

}
