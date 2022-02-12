import java.util.HashMap;

public class Assignment4KeyExistsInHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();

		hashmap.put(1, "I");
		hashmap.put(2, "Love");
		hashmap.put(3, "Working");
		hashmap.put(4, "With");
		hashmap.put(5, "Broadridge");

		boolean flag = hashmap.containsKey(1);
		System.out.println("Key 22 exists in HashMap? : " + flag);
		boolean flag2 = hashmap.containsKey(2);
		System.out.println("Key 55 exists in HashMap? : " + flag2);
		boolean flag3 = hashmap.containsKey(99);
		System.out.println("Key 99 exists in HashMap? : " + flag3);
	}
}
