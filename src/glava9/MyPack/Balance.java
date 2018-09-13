// Простой пакет
package glava9.MyPack;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
class Balance {
    String name;
    double bal;

    Balance(String n, double b){
        name = n;
        bal = b;
    }

    void show() {
        if(bal < 0) {
            System.out.print("--> ");
            System.out.println(name + ": $" + bal);
        }
    }
}

