package sample;

/**
 * Created by prilipko.ia on 27.08.2018.
 */
public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++){
            int y = -1; // Переменная y инициализируется прикаждом вхождении в блок
            System.out.println("y равно: " + y); // Здесь всегда выводится -1

            y = 100;
            System.out.println("y теперь равно: " + y);
        }
    }
}
