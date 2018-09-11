package glava7.primer18;

/**
 * Created by prilipko.ia on 11.09.2018.
 */
// если убрать комментирование строки 26, программа не скомпилируется

public class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // это внутренний класс
    class Inner {
        int y = 10; // y - локальная переменная класса Inner

        void display() {
            System.out.println("Вывод outer_x = " + outer_x);
        }
    }

    void showy() {
        // System.out.println(y); // ошибка, здесь переменная y недоступна
    }
}

class InnerClassDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}