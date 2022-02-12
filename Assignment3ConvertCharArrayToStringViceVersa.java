public class Assignment3ConvertCharArrayToStringViceVersa {
	public static void main(String[] args) {
		
		char[] ch = { 'A', 'S', 'S', 'I', 'G', 'N', 'M', 'E', 'N', 'T' };
		String str = new String(ch);
		System.out.println(str);
		char c[] = str.toCharArray();
		System.out.println("On using toCharArray() method -");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
	}
}
