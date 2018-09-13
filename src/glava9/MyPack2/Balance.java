package glava9.MyPack2;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
// Теперь класс Balance, его конструктор и метод show() является открытым. Это означает, что они
// доступны из кода классов, не производных от классов их пакета

public class Balance {
    String name;
    double bal;

    public Balance(String n, double b) {
        name = n;
        bal = b;
    }

    public void show() {
        if(bal < 0) {
            System.out.print("--> ");
            System.out.println(name + " $:" + bal);
        }
    }
}
