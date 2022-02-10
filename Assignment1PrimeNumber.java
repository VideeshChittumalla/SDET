public class Assignment1PrimeNumber {

	public static void main(String[] args) {

		int x = 0;
		int y = 30;

		for (int i = x; i <= y; i++) 
    {
			  if (i == 0 || i == 1)
				continue;
			  boolean flag = true;
			  for (int j = 2; j <= i / 2; j++) 
        {
				  if (i % j == 0) 
          {
					flag = false;
					break;
				  }
	     }
			 if (flag == true)
			 System.out.print(i + " ");
		}
	}
}
