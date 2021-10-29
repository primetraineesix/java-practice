package collectionframework;

import java.util.LinkedList;

/**
 * Created by Jay Vaghani
 */
public class LinkedListDemo3 {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("Dog");
        l.add("Dog");
        l.add("Cat");
        l.add("Horse");
        System.out.println(l); //[Dog, Dog, Cat, Horse]
        l.addFirst("Tiger");
        l.addLast("elephant");

        System.out.println(l); //[Tiger, Dog, Dog, Cat, Horse, elephant]
        System.out.println(l.getFirst());
        System.out.println(l.getLast());
        l.removeFirst();
        l.removeLast();
        System.out.println(l); //[Dog, Dog, Cat, Horse]


    }
}
