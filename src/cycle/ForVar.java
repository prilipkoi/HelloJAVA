package cycle;

/**
 * Created by prilipko.ia on 04.09.2018.
 */
public class ForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;

        i = 0;
        for ( ; !done; ) {
            System.out.println("i равно " + i);
            if(i == 10) done = true;
            i++;
        }
    }
}
