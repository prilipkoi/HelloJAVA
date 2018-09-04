package sample;

/**
 * Created by prilipko.ia on 27.08.2018.
 */
public class Area {
    public static void main(String[] args) {
        double pi, r, a;

        r = 10.8; //Радиус окружности
        pi = 3.1416; // Приблизительное значение Пи
        a = pi * r * r; // Площадь круга
        System.out.println("Площадь круга радиусом " + r + " равна " + a);
    }
}
