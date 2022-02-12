import java.util.*;

public class Assignment4ReverseArrayList
{
    public static void main(String[] args) 
    {       
        ArrayList<String> arrlist = new ArrayList<String>(); 
        arrlist.add("Hi");         
        arrlist.add("Welcome");        
        arrlist.add("Broadridge");
        Collections.reverse(arrlist);         
        System.out.println(arrlist);
    }
} 
