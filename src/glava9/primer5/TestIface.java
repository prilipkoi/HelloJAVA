package glava9.primer5;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
