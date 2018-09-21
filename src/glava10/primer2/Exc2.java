package glava10.primer2;

/**
 * Created by prilipko.ia on 20.09.2018.
 */
public class Exc2 {
    public static void main(String[] args) {
        int d, a;
        try { // проконтролировать блок кода
            d = 0;
            a = 42 / d;
            System.out.println("Это не будет выведено.");
        } catch (ArithmeticException e) { // перехват ошибки деления на нуль
              System.out.println("Деление на нуль!");
        }
        System.out.println("После оператора catch");
    }
}
