package sample;

/**
 * Created by prilipko.ia on 04.09.2018.
 */
public class noBody {
    public static void main(String[] args) {
        int i = 100, j = 200;
        while (++i < --j);
        System.out.println("Среднее значение равно " + i);
    }
}
