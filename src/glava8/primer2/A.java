package glava8.primer2;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
// В иерархии классов закрытые члены остаются закрытыми в пределах своего класса, ошибка в 24 строке

public class A {
    int i;          // этот член открыт по умолчанию
    private int j;  // а этот член закрыт в классе A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

// Член j класса A в этом классе недоступен

class B extends A {
    int total;

    void sum() {
        // total = i + j; // ошибка: член j в этом классе недоступен
    }
}

class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setij(10, 12);

        subOb.sum();
        System.out.println("Сумма равна: " + subOb.total);
    }
}