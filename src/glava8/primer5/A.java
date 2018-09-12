package glava8.primer5;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
public class A {
    int i;
}

//    создать подкласс путем расширения класса A

class B extends A {
    int i; // этот член i скрывает член i класса A

    B(int a, int b) {
        super.i = a;    // член из класса A
        i = b;          // член из класса B
    }

    void show() {
        System.out.println("Член i в суперклассе: " + super.i);
        System.out.println("Член i в подклассе: " + i);
    }
}

class UseSuper {
    public static void main(String[] args) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}
