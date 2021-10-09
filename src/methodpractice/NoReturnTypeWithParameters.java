package methodpractice;

/**
 * Created by Jay Vaghani
 */
public class NoReturnTypeWithParameters {

    public static void main(String[] args) {
        NoReturnTypeWithParameters nR = new NoReturnTypeWithParameters();
        nR.addition(10,20,30);
        nR.myName("Amit");
    }

    // 3. No return type with parameters
    public void addition(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void myName(String name){
        System.out.println(name);
    }
}
