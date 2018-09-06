package cycle;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
public class ForEach {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Использовать цикл в стиле for each для вывода и
        // суммирования значений

        for (int x : nums){
            System.out.println("Значение равно " + x);
            sum += x;
        }
        System.out.println("Сумма равна: " + sum);
    }
}
