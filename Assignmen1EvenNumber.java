public class Assignmen1EvenNumber {
	public static void main(String args[]) {
		int n = 50;
		System.out.print("Even Numbers from 1 to " + n + " are: ");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
