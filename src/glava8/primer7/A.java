package glava8.primer7;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
// Продемонстрируем порядок вызова конструкторов
//    создадим суперкласс

public class A {
    A() {
        System.out.println("В конструкторе A.");
    }
}

// создать подкласс путем расширения класса A

class B extends A {
    B() {
        System.out.println("В конструкторе B.");
    }
}

// создать еще один подкласс путем расширения класса B

class C extends B {
    C() {
        System.out.println("В конструкторе C.");
    }
}

class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
