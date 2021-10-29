package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by Jay Vaghani
 */
public class HashSetDemo1 {

    public static void main(String[] args) {
        //HashSet hs = new HashSet(100); // initial capacity 100
        //HashSet hs = new HashSet(100, (float) 0.90);
        //HashSet<Integer> hs = new HashSet<Integer>();
        HashSet hs = new HashSet(); // default capacity is 16 and Load factor 0.75

        // Add objects/elements into HashSet
        hs.add(100);
        hs.add("Prime");
        hs.add(16.5);
        hs.add('A');
        hs.add(true);
        hs.add(null);
        System.out.println(hs); // [16.5, null, A, Prime, 100, true] // Insertion order not preserved.

        // remove()
        hs.remove(16.5);
        System.out.println("After removing element: " + hs);

        // contains()
        System.out.println(hs.contains("Prime")); //true
        System.out.println(hs.contains("xyz")); //false

        // isEmpty()
        System.out.println(hs.isEmpty()); //false

        //Reading objects/elements from hashset using for each loop
        /*for (Object e : hs) {
            System.out.println(e);
        }*/

        //Reading objects/elements from hashset using Iterator
        Iterator it = hs.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
