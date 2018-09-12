package glava8.primer14;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
public class A {
    final void meth() {
        System.out.println("Это завершенный метод");
    }
}

class B extends A {
    /* void meth() {    // Этот метод не может быть переопределен.
        System.out.println("Недопустимо!");
    } */
}
