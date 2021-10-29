package collectionframework;

import java.util.LinkedHashSet;

/**
 * Created by Jay Vaghani
 */
public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        //Declaration
        //LinkedHashSet<Integer> lSet = new LinkedHashSet();
//        HashSet lSet = new HashSet();
        LinkedHashSet lSet = new LinkedHashSet();
        lSet.add(100);
        lSet.add(200);
        lSet.add(300);
        lSet.add(400);
        lSet.add(500);

        System.out.println(lSet); //[100, 200, 300, 400, 500]
    }
}
