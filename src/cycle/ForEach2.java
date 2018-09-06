package cycle;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
public class ForEach2 {
    public static void main(String[] args) {
        int sum = 0;
        int nums[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // использовать цикл for в стиле for each для
        // dsdjlf b cevvbhjdfybz pyfxtybq bp xfcnb vfccbdf
        for(int x : nums) {
            System.out.println("Значение x равно: " + x);
            sum += x;
            if(x == 5) break;
        }
        System.out.println("Суииа первых пяти элементов массива равна: " + sum);
    }
}
