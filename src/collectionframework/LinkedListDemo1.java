package collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Jay Vaghani
 */
public class LinkedListDemo1 {

    public static void main(String[] args) {
        //Declare Linked List
//        LinkedList<String> list =  new LinkedList<String>();
//        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        LinkedList l = new LinkedList();

        // Add elements into linked list
        l.add(100);
        l.add("Prime");
        l.add(15.5);
        l.add('A');
        l.add(true);
        l.add(null);

        System.out.println(l);

        // Find the size of list
        System.out.println("Size of linked list: " +l.size()); // 6

        // Remove element from list
        l.remove(3); // passing index
        System.out.println("After removing :" +l);

        // Inserting/adding new element in the middle of the linked list
        l.add(3, "JAVA");
        System.out.println("After inserting element : " + l);

        // Retrieving value/object
        System.out.println(l.get(3)); // JAVA

        // Change/replacing the element
        l.set(5, "X");
        System.out.println("After changing the value :" +l);

        // Contains()
        System.out.println(l.contains("JAVA")); // true
        System.out.println(l.contains("Python")); // false

        // isEmpty()
        System.out.println(l.isEmpty()); // false

        // Reading elements from LL using for loop
       /* for (int i = 0; i < l.size(); i++) {
            System.out.println(l.get(i));
        }*/

        // Reading elements from LL using for...each loop
       /* for (Object o:l ) {
            System.out.println(o);
        }*/

        // Reading elements from LL using iterator loop
        Iterator it = l.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }



    }
}
