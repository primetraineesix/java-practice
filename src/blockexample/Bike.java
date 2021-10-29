package blockexample;

/**
 * Created by Jay Vaghani
 */
public class Bike {

    {
        System.out.println("Instance block calling");
    }

    public Bike(){
        System.out.println("Constructor Calling");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
    }
}
