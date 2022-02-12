public class Assignment3PresenseOfString {
	public static void main(String[] args) {
		String str1 = "A brown fox ran away fast";
		int intIndex = str1.indexOf("brown");
		if(intIndex == - 1) {
			System.out.println("brown not found");
		} else {
			System.out.println("Found brown");
		}
	}
}
