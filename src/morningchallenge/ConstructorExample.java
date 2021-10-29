package morningchallenge;

/**
 * Created by Jay Vaghani
 */
public class ConstructorExample {
    int empId;
    String name;

    public ConstructorExample(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorExample emp1 = new ConstructorExample(10, "Jhon");
        emp1.printEmpDetails();
        ConstructorExample emp2 = new ConstructorExample(11, "Smith");
        emp2.printEmpDetails();
    }

    public void printEmpDetails(){
        System.out.println(empId);
        System.out.println(name);
    }


}
