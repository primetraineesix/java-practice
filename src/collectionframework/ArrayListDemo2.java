package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Jay Vaghani
 */
public class ArrayListDemo2 {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("X");
        al.add("Y");
        al.add("Z");
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList al_Dup = new ArrayList();
        al_Dup.addAll(al);
        System.out.println(al_Dup);

        al_Dup.removeAll(al);
        System.out.println("After removing " + al_Dup);

        // Sort  Collection.sort()
        System.out.println("Elements in the array list : " +al); //[X, Y, Z, A, B, C]
        Collections.sort(al);
        System.out.println("Elements in the array list after sorting : " +al); //[A, B, C, X, Y, Z]

        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Elements in the array list after sorting in reverse order : " +al); // [Z, Y, X, C, B, A]

        // Shuffling - Collections.shuffle()
        Collections.shuffle(al);
        System.out.println("Elements in the array list after sorting shuffling : " +al);

    }
}
