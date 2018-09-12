package glava8.primer9;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
// Методы с отличающимися сигнатурами считаются перегружаемыми, а не переопределяемыми

class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

//    вывести содержимое переменных i и  j
    void show() {
        System.out.println("i и j: " + i + " " + j);
    }
}

// создать подкласс путем расширения класса A

class B extends A {
    int k;
    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

//    перегреузить метод show()

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);

        subOb.show("Это k: ");   // вызвать метод show() из класса B
        subOb.show();                 // вызвать метод show() из класса A
    }
}
