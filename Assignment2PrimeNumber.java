package Assignment2;

public class Assignment2PrimeNumber {

	public static void main(String args[]) {
		int temp;
    int n = 13;

		for (int i = 2; i <= n / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				System.out.println(n + " is not a Prime Number");
				break;
			}
		}
	}
}
