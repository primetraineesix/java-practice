package collectionframework;

import java.util.HashSet;

/**
 * Created by Jay Vaghani
 */
public class HashSetDemo2 {

    public static void main(String[] args) {
        HashSet<Integer> evenNumber = new HashSet();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        evenNumber.add(8);

        System.out.println("Hashset: " + evenNumber); //[2, 4, 6, 8]

        HashSet<Integer> number = new HashSet();
        number.addAll(evenNumber);
        number.add(10);

        System.out.println("New Hashset: " + number); // [2, 4, 6, 8, 10]

        // removeAll()
        number.removeAll(evenNumber);
        System.out.println("Removed even numbers: " + number); //[10]



    }
}
