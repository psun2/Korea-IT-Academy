class RecursivePrime {
	static int primeNum(int prime) {
		int cnt = 0;

		if (checkPrime(prime, prime / 2))
			cnt++;
		if (prime == 1)
			return 0;

		return cnt += primeNum(--prime);
	}

	static boolean checkPrime(int prime, int i) {
		if (i < 2)
			return true;
		else if (prime % i == 0)
			return false;

		return checkPrime(prime, --i);
	}
}

public class Main2 {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(RecursivePrime.primeNum(x));
	}

}