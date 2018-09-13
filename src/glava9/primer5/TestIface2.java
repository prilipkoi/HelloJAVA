package glava9.primer5;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

        c = ob; // теперь переменная c ссылаестя на объект типа AnotherClient

        c.callback(42);
    }
}
