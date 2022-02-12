import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;

class Assignment4SetViewFrmHashTable{

  public static void main(String args[]) {
 
    HashMap<String, String> hmap = new HashMap<String, String>(); 
 
    hmap.put("Key1", "One");
    hmap.put("Key2", "Two");
    hmap.put("Key3", "Three");
    hmap.put("Key4", "Four");
    hmap.put("Key5", "Five");
 
    Set<String> keys = hmap.keySet();

    System.out.println("Set of Keys contains: ");
 
    Iterator<String> it = keys.iterator();
    
    while(it.hasNext()){
       System.out.println(it.next());
    } 
  }
}
