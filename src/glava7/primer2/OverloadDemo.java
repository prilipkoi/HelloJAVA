package glava7.primer2;

/**
 * Created by prilipko.ia on 10.09.2018.
 */
public class OverloadDemo {
    void test() {
        System.out.println("Параметры отсутствуют");
    }

    // перегружаемый метод, проверяющий наличие двух целочисленных параметров

    void test(int a, int b) {
        System.out.println("a и b: " + a + " " + b);
    }

    // перегружаемый метод, проверяющий наличие параметра типа double

    void test(double a) {
        System.out.println("Внутреннее преобразование при вызове test(double) a: " + a);
    }
}

class Overload{
    public static void main(String[] args) {
        OverloadDemo ob = new OverloadDemo();
        int i = 88;

        ob.test();
        ob.test(10, 20);

        ob.test(i);             // здесь вызывается вариант метода test(double)
        ob.test(123.2);     // а здесь вызывается вариант метода test(double)
    }
}