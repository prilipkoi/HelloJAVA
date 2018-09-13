package glava9.MyPack2Test;

import glava9.MyPack2.*;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public class TestBalance {
    public static void main(String[] args) {
//        класс Balance объявлен как public, поэтому им можно воспользоваться и вызвать его конструктор.

        Balance test = new Balance("J. J. Jaspers", -99.88);

        test.show();
    }
}
