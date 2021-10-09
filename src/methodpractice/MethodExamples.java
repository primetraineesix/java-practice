package methodpractice;

/**
 * Created by Jay Vaghani
 */
public class MethodExamples {

    public static void main(String[] args) {
        MethodExamples methodExamples = new MethodExamples();
        int result = methodExamples.addition(10, 30);
        System.out.println(result);

        System.out.println(methodExamples.myName("Amit"));
    }

    //1. With return type with parameter
    public int addition(int a, int b){
        int result = a+b;
        return result;
    }

    public String myName(String name){
        return name;
    }
}
