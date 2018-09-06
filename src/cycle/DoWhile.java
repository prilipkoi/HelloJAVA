package cycle;


/**
 * Created by prilipko.ia on 04.09.2018.
 */
public class DoWhile {
    public static void main(String[] args) {
        int n = 10;
        do {
            System.out.println("такт " + n);
            n--;
        } while (n > 0);
    }
}
