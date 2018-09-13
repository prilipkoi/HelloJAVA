package glava8.primer8;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
public class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

//    вывести содержимое переменных i и j

    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

//    вывести содержимое переменной k с помощью метода переопределяющего метод show() из класса A

    void show() {
        //super.show(); // если надо получить доступ к методу show() суперкласса (класса A)
        System.out.println("k: " + k);
    }
}

class Override {
    public static void main(String[] args) {
        B subOb = new B(1,2,3);
        subOb.show();   // здесь вызываестя метод show() из класса B
    }
}