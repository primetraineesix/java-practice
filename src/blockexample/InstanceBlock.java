package blockexample;

/**
 * Created by Jay Vaghani
 */
public class InstanceBlock {

    int speed;
    {
        speed = 100;
    }
    InstanceBlock(){
        System.out.println(speed);
    }

    public static void main(String[] args) {
        InstanceBlock ib = new InstanceBlock();
    }

}
