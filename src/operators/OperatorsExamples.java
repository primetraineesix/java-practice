package operators;

/**
 * Created by Jay Vaghani
 */
public class OperatorsExamples {

    public static void main(String[] args) {
        // 1. Arithmetic operators -----> +, -, *, /, %

        int a = 10;
        int b = 20;

        System.out.println(a+b); // 30
        System.out.println(a-b); // -10
        System.out.println(a*b); // 200
        System.out.println(b/a); // 2
        System.out.println(a%b); // 10

        // 2. Relational operators -----> <, >, <=, >=, !=, ==
        System.out.println(a<b); // true
        System.out.println(a>b); // false
        System.out.println(a<=b); // true
        System.out.println(a>=b); // false
        System.out.println(a==b); // false
        System.out.println(a!=b); // true

        // 3. Logical operators -----> || - or, && -And, !=
        boolean x;
        boolean y;

        x= true;
        y = true;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        x= true;
        y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        x= false;
        y = true;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        x= false;
        y = false;
        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        System.out.println(x && y);
        System.out.println(x || y);
        System.out.println(!x);
        System.out.println(!y);

        // 4. Assignment operators -----> =, +=, -=

        int c = 4;
        int var;

        var = c;
        System.out.println("var using = " +var);

        var += c;
        System.out.println("var using += " +var);

        var *= c;
        System.out.println("var using += " +var);

        // 5. Incremental and decremental operators -----> ++, -- (postfix ++a and prefix a++)
        int e = 5;
        ++e;
        System.out.println("Increment by ++e :" + e);
        e++;
        System.out.println("Increment by e++ :" + e);
        --e;
        System.out.println("Decrement by --e :" + e);
        e--;
        System.out.println("Decrement by e-- :" + e);


    }
}
