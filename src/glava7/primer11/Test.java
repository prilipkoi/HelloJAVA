package glava7.primer11;

/**
 * Created by prilipko.ia on 11.09.2018.
 */
// рассматривается отличие модификаторов public и private

public class Test {
    int a;
    public int b;
    private int c;

    // методы доступа к члену c данного класса

    void setc(int i) { // установить значение члена c данного класса
        c = i;
    }

    int getc() { // получить значение члена c данного класса
        return c;
    }
}

class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();

        // эти операторы правильны, поэтому члены a и b данного класса доступны непосредственно

        ob.a = 10;
        ob.b = 20;

        // этот оператор неверен, и вызовет ошибку
        // ob.c = 100

        // доступ к члену c данного класса должен осуществляться с помощью методов ее класса

        ob.setc(100);
        System.out.println("a, b и c: " + ob.a + " " + ob.b + " " + ob.getc());

    }
}