package Utils;

/**
 * Calculations relating to prime numbers
 * Bill Nicholson
 * nicholdw@ucmail.uc.edu
 * @author nicomp
 *
 */
public class PrimeNumbers {

	public static void main(String[] args) {
		

	}
	/***
	 * Check primeness of an integer
	 * @param num The number to check
	 * @return True if num is prime, false otherwise
	 */
	public static boolean isPrime(int num) {
		boolean result = true;
		
		int limit = num / 2;
		for (int i = 2; i <= limit; i++) {
			if ((num % i) == 0) {result = false; break;}
		}
		return result;
	}
}
