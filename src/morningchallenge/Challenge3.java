package morningchallenge;

/**
 * Created by Jay Vaghani
 */

/**
 * Challenge-3
 * Write a java program using the following requirement.
 * 1.Create a Java class with name 'Challenge3'
 * 2.Declare two int type instance variables with name 'eId' and 'deptNo'
 * 3.Declare two String type instance variables with name 'eName' and 'job'
 * 4.Create a instance no returntype method with name 'display'and call all
 *   four variables inside the display method inside the sout statements.
 * 5.Create a main method
 * 6.Create a object with name 'emp1' and call all four variable and assign
 *   the values for each variable and call the display method
 * 7.Create a object with name 'emp2' and call all four variable and assign
 *   the values for each variable and call the display method
 *
 * Output:
 * 101
 * John
 * 10
 * Manual Tester
 * 102
 * Smith
 * 11
 * Automation Tester
 */
public class Challenge3 {

    int eId;
    int deptNo;
    String eName;
    String job;

    public void display(){
        System.out.println(eId);
        System.out.println(eName);
        System.out.println(deptNo);
        System.out.println(job);
    }

    public static void main(String[] args) {
        Challenge3 emp1 = new Challenge3();
        emp1.eId = 101;
        emp1.eName = "John";
        emp1.deptNo = 10;
        emp1.job = "Manual Tester";
        emp1.display();

        emp1.eId = 102;
        emp1.eName = "Smith";
        emp1.deptNo = 11;
        emp1.job = "Automation Tester";
        emp1.display();
    }
}
