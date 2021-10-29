package collectionframework;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Created by Jay Vaghani
 */
public class LinkedListDemo2 {

    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("X");
        l.add("Y");
        l.add("Z");
        l.add("A");
        l.add("B");
        l.add("C");

        System.out.println(l);

        // Adding group of element to linked list
        LinkedList new_l = new LinkedList();
        new_l.addAll(l);
        System.out.println(new_l); //[X, Y, Z, A, B, C]

        new_l.removeAll(l);
        System.out.println(new_l); //[]
        // Sort() Collections.sort(collection)
        System.out.println("Before sorting: " + l); //[X, Y, Z, A, B, C]
        Collections.sort(l);
        System.out.println("After sorting: " + l); // [A, B, C, X, Y, Z]

        // Reverse order
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Reverse order: " + l); // [Z, Y, X, C, B, A]

        // Shuffling
        Collections.shuffle(l);
        System.out.println("After Shuffling: " +l); //[B, X, A, Y, C, Z]
    }
}
