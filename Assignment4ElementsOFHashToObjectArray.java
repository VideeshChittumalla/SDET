import java.util.HashSet;

class Assignment4ElementsOFHashToObjectArray {
	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();

		hset.add("One");
		hset.add("Two");
		hset.add("Three");

		String[] Arr = new String[hset.size()];
		hset.toArray(Arr);

		System.out.println("Array elements: ");
		for (String temp : Arr) {
			System.out.println(temp);
		}
	}
}
