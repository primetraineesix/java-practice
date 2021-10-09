package variables;

/**
 * Created by Jay Vaghani
 */
public class InstanceVariables {

    int a = 100;

    public static void main(String[] args) {
        // static area
        InstanceVariables obj = new InstanceVariables();
        System.out.println(obj.a); // access by Object into static variable
    }

    public void test(){
        // Instance area
        System.out.println(a); // Direct access to instance area
    }
}
