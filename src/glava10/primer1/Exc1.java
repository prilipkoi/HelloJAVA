package glava10.primer1;

/**
 * Created by prilipko.ia on 20.09.2018.
 */
// Получаем exception

public class Exc1 {
    static void subroutine() {
        int d = 0;
        int a = 10/d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
    }
}
