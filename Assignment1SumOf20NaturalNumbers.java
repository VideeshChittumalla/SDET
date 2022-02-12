public class Assignment1SumOf20NaturalNumbers {
	public static void main(String[] args) {

		int n = 20, i = 1, total = 0;
    while (i <= n) {
			total = total + i;
			i++;
		}
    System.out.println("Sum of the first 20 natural numbers is: " + total);
	}
}
