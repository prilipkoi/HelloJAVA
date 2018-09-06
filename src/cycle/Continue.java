package cycle;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if(i % 2 == 0) continue;
            System.out.println();
        }
    }
}
