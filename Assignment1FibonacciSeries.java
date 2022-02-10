import java.util.Scanner;
public class Assignment1FibonacciSeries {
	
	public static void main(String[] args) {

        int firstnumber = 0, secondnumber = 1;
        Scanner scanner = new Scanner(System.in);

		    System.out.println("Enter the Length of the fibonacci required:");
		    int n = scanner.nextInt();
        
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(firstnumber + " , ");

            int sum = firstnumber + secondnumber;
            firstnumber = secondnumber;
            secondnumber = sum;
        }
    }
}
