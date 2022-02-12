import java.util.TreeSet;

public class Assignment4HighLowInTreeSet {

	public static void main(String[] args) {

		TreeSet<String> tSet = new TreeSet<String>();

		tSet.add("10");
		tSet.add("20");
		tSet.add("40");
		tSet.add("50");
		tSet.add("90");

		System.out.println("Lowest value Stored in Java TreeSet is : " + tSet.first());

		System.out.println("Highest value Stored in Java TreeSet is : " + tSet.last());

	}
}
