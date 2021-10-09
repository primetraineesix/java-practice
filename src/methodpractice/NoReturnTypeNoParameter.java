package methodpractice;

/**
 * Created by Jay Vaghani
 */
public class NoReturnTypeNoParameter {

    public static void main(String[] args) {
        NoReturnTypeNoParameter nR = new NoReturnTypeNoParameter();
        nR.addition();

    }

    // 4. No Return type with no parameter
    public void addition() {
        int a = 10;
        int b = 20;
        System.out.println(a + b);
    }
}
