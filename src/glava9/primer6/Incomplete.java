package glava9.primer6;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
abstract class Incomplete implements Callback {
    int a, b;

    void show() {
        System.out.println(a + " " + b);
    }
}
