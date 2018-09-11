package glava7.primer6;

/**
 * Created by prilipko.ia on 11.09.2018.
 */

// аргументы примитивных типов передаются по значению

public class Test {
    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
}

class CallByValue {
    public static void main(String[] args) {
        Test ob = new Test();

        int a = 15, b = 20;

        System.out.println("a и b до вызова: " + a + " " + b);

        ob.meth(a, b);

        System.out.println("a и b после вызова " + a + " " + b);
    }
}