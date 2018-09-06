package cycle;

/**
 * Created by prilipko.ia on 04.09.2018.
 */
public class Comma {
    public static void main(String[] args) {
        int a,b;

        for (a = 1, b = 4; a<b; a++, b--) {
            System.out.println("a = " + a);
            System.out.println("b = " + b);
        }
    }
}
