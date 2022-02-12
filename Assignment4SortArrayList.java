import java.util.*;
public class Sortarraylist  {

	public static void main(String args[]){
	   ArrayList<String> Alist = new ArrayList<String>();
	   Alist.add("Broadridge");
	   Alist.add("Solutions");
	   Alist.add("Financial");
	   Alist.add("Hyderabad");
     Collections.sort(Alist);
	   for(String ctr: Alist){
			System.out.println(ctr);
		}
	}
}
