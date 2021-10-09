package methodpractice;

/**
 * Created by Jay Vaghani
 */
public class WithReturnTypeNoParameter {

    public static void main(String[] args) {
        WithReturnTypeNoParameter rT = new WithReturnTypeNoParameter();
        System.out.println(rT.addition());
        System.out.println(rT.myName());
    }

    //2. With return type with no parameter
    public int addition(){
        int a = 20;
        int b = 30;
        int result = a+b;
        return result;
    }

    public String myName(){
        return "Jay";
    }
}
