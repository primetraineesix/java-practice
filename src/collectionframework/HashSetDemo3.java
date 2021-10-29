package collectionframework;

import java.util.HashSet;

/**
 * Created by Jay Vaghani
 */
public class HashSetDemo3 {

    public static void main(String[] args) {
        //Union, Intersection, Difference
        HashSet<Integer> hashSet1 = new HashSet();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);
        System.out.println("Hashset 1: " +hashSet1); //[1, 2, 3, 4, 5]

        HashSet<Integer> hashSet2 = new HashSet();
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        System.out.println("Hashset 2: " +hashSet2); //[3, 4, 5]

        //Union
        //hashSet1.addAll(hashSet2);
        //System.out.println("Union :" +hashSet1);

        //Intersection
        //hashSet1.retainAll(hashSet2);
        //System.out.println("Intersection : "+hashSet1); // [3, 4, 5]

        //Difference
        //hashSet1.removeAll(hashSet2);
        //System.out.println("Difference : " +hashSet1); //[1, 2]

        // Subset (hashset2 is subset of hashset1)
        System.out.println(hashSet1.containsAll(hashSet2)); // true

    }
}
