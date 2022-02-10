import java.util.Scanner;
public class Assignment1Factorial {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number to find factorial");
		int n = scanner.nextInt();
		long fn = 1;
		int i = 1;
		while (i <= n) {
			fn = fn * i;
			i++;
		}
		System.out.println("Factorial of " + n + " is: " + fn);
	}

}
