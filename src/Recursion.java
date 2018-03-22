/**
 * Test Recursion 
 * @author Vichakorn1
 * 
 */
import java.util.ArrayList;
import java.util.List;

public class Recursion {
/**
 * 4.1)Delete the duplicate alphabet that next to itself.
 * @param list
 * @return list that cut out the duplicated.
 */
	public static List<String> unique(List<String> list) {
		if (list.size() < 2)
			return list;
		if (list.get(0).equals(list.get(1))) {
			list.remove(0);
			return unique(list);
		} else {
			return unique(list.subList(1, list.size()));
		}
	}
/**
 * 4.2)Normal method for fibonacci.
 * @param n is number of fibonnaci function
 * @return number of fibonnaci.
 */
	public static long fibonacci(int n) {
		// the base case
		if (n < 2)
			return n;
		// the recursive step
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
/**
 * Make method fibonacci faster by using Recursion.
 * @param n is number of fibonnaci function
 * @return number of fibonnaci.
 */
	public static long newFibonacci(long n) {
		long start = 1 ;
		long fibonacci1 = 1;
		long fibonacci0 = 0;
		if (n < 2)
			return n;
		else
			return helpFibonacci(n, start,fibonacci1,fibonacci0);

	}
/**
 * this for help the newFibonacci to calculation.
 * @param n number of fibonacci function.
 * @param start is a round of run.
 * @param f1 is n-1.
 * @param f0 is n-2.
 * @return number of fibonacci.
 */
	public static long helpFibonacci(long n, long start, long f1, long f0) {
		long current = start + 1;
		long sumFibonacci = f1 + f0;
		if (n == current) return sumFibonacci;

		return helpFibonacci(n, current, sumFibonacci, f1);
	}
/**
 * test all method
 * @param args
 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("b");
		list.add("b");
		unique(list);
		List<String> newList = list;
		System.out.println(newList); // print list that cut the duplicate alphabet(4.1).
		System.out.println("normal " + fibonacci(48)); // normal fibonacci.
		System.out.println("improve " + newFibonacci(48));

	}
}
