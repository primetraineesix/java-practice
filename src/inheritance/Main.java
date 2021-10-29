package inheritance;

/**
 * Created by Jay Vaghani
 */
public class Main extends ChildClass{

    public void m1(){
        super.m1();
        System.out.println("Main class m1 method");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.m1();


    }
}
