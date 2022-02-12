public class Assignment2FindDuplicatesInArray {
	public static void main(String[] args) {
		int[] A = { 26,32,84,26,86,84,32,29,29,80 };

		for (int i = 0; i < A.length - 1; i++) 
		{
		for (int j = i + 1; j < A.length; j++) 
		{
		if ((A[i] == A[j]) && (i != j)) 
		{
		System.out.println("Duplicate Element : " + A[j]);
		}
		}
		}
	  }
}
