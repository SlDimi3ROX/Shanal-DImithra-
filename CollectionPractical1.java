import java.util.Collection;
import java.util.LinkedList;

public class CollectionPractical1 {
    public static void main(String[] args) {

        Collection<Integer> c = new LinkedList<>();


        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
            System.out.println( c.isEmpty ());
	    
               System.out.println( c.size());
	    
                  System.out.println(c.contains(30));
	    
                    c.remove(40);
                      System.out.println(c);
    }
}
