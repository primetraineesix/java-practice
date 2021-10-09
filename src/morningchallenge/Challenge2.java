package morningchallenge;

/**
 * Created by Jay Vaghani
 */
public class Challenge2 {

    /*Challenge-2.

    Write a java program using the following requirement.
            1.Create a Java class with name 'Challenge2'
            2.Create a main method.
            3.Declare the Two Int type variables with names 'a' and 'b' and assign value is
  'a'= '10' and 'b'= '20'
            4.Write Four println statements. Like (Note Please not swap the variables)
  System.out.println(a);
  System.out.println(b);

  System.out.println(a);
  System.out.println(b);

5. Output of Programe is
	10
            20
            20
            10*/

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        a = 20;
        b = 10;
        System.out.println(a);
        System.out.println(b);
    }
}
