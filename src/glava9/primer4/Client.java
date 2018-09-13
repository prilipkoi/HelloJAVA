package glava9.primer4;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public class Client implements Callback {
//    реализуем интерфейс Callback

    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением: " + p);
    }
}
