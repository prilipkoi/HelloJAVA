package sample;

/**
 * Created by prilipko.ia on 27.08.2018.
 */
public class BlockTest {
    public static void main(String[] args) {
        int x, y;
        y = 20;
        for (x = 0; x < 10; x++) {
            System.out.println("Значение x: " + x);
            System.out.println("Значение y: " + y);
            y = y - 2;
            System.out.println();
        }
    }
}
