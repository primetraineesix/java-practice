package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Jay Vaghani
 */
public class ArrayListDemo1 {
    public static void main(String[] args) {
        // Declare ArrayList
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        ArrayList<String> aList = new ArrayList<String>();
//        List al = new ArrayList();
        ArrayList al = new ArrayList();

        // Add new elements to the arraylist
        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);
        System.out.println(al); //[100, Welcome, 15.5, A, true]

        //size()
        System.out.println("Number of element in array list: "+al.size());

        //remove
        al.remove(1); // here 1 is index
        //al.remove("Welcome"); // Here welcome is element
        System.out.println("After removing from array list: " +al);

        // insert a new element
        //add(index, object)
        al.add(2, "Python");
        System.out.println("After insertion : " +al);

        // retrieve specific element
        System.out.println(al.get(2)); //Python

        // change element/replace
        al.set(2, "C#");
        System.out.println("After replacing element : " +al); //[100, 15.5, C#, A, true]

        // search - contains() - Returns true or false
        System.out.println(al.contains("C#")); // true
        System.out.println(al.contains("C++")); // false

        //isEmpty() - Returns true/false
        System.out.println(al.isEmpty());

        // 1) for loop
        System.out.println("Reading elements using for loop.........");
        for (int i = 0; i <al.size(); i++) {
            System.out.println(al.get(i));
        }
        //  2) for.. each loop
        System.out.println("Reading elements using for each loop.........");
        for (Object obj: al) {
            System.out.println(obj);
        }

        //  3) iterator()
        System.out.println("Reading elements using for iterator.........");
        Iterator it = al.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
