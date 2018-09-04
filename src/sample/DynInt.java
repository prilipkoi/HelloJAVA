package sample;

/**
 * Created by prilipko.ia on 27.08.2018.
 */
public class DynInt {
    public static void main(String[] args) {
        double a = 3.0, b = 4.0;

        // Динамическая инициализация переменной c
        double c = Math.sqrt(a * a + b * b);
        System.out.println("Гипотенуза равна " + c);
    }
}
