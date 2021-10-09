package variables;

/**
 * Created by Jay Vaghani
 */
public class StaticVariables {

    static  int x = 10; // static variable
    static String name = "Amit";

    public static void main(String[] args) {
        int b = 10;
        System.out.println(x); //  direct calling to static area
        System.out.println(StaticVariables.x); // using class name
        System.out.println(name);
        System.out.println(StaticVariables.name);
        myMethod();
    }

    public static  void myMethod(){
        System.out.println(x); // direct access to static area
        System.out.println(StaticVariables.x); // Using class name
    }

    public void myMethod1(){
        System.out.println(x);
    }
}
