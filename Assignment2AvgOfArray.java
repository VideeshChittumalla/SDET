public class Assignment2AvgOfArray {
	
	public static void main(String[] args) {
        Int[] arr = {1, 2, 3, 4, 5};
        int total = 0;
        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        double average = total / arr.length;
        System.out.format("The average is: %.2f", average);
    }
}

