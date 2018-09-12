package glava8.primer12;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
// Простой пример абстракции

public class A {
    void callmetoo() {
        System.out.println("Это конкретный метод");
    }
}

class B extends A {
    void callme() {
        System.out.println("Реализация метода callme() из класса B.");
    }
}

class AbstractDemo {
    public static void main(String[] args) {
        B b = new B();

        b.callme();
        b.callmetoo();
    }
}
