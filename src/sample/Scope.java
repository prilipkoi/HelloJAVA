package sample;

/**
 * Created by prilipko.ia on 27.08.2018.
 */
public class Scope {
    public static void main(String[] args) {
        int x; // Эта переменная доступна всему коду из метода main()

        x = 10;
        if (x == 10) { // Начало новой области действия,
            int y = 20; //доступной только этому блоку кода

            // Обе переменные x и y доступны в этой области действия
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
         //y = 100; //Ошибка! переменная y недоступна в этой области действия, тогда как переменная x доступна и здесь
        System.out.println("x равно " + x);
    }
}
