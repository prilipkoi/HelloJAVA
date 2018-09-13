package glava9.primer7;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public class NestedIfDemo {
    public static void main(String[] args) {
//        использовать ссылку на вложенный интерфейс

        A.NestedIf nif = new B();

        if(nif.isNotNegative(10))
            System.out.println("Число 10 неотрицательно");
        if(nif.isNotNegative(-12))
            System.out.println("Это не будет выведено");
    }
}
