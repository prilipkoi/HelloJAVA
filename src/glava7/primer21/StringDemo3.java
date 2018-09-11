package glava7.primer21;

/**
 * Created by prilipko.ia on 11.09.2018.
 */
// демонстрируем применение массивов объектов типа String
public class StringDemo3 {
    public static void main(String[] args) {
        String str[] = {"один", "два", "три"};

        for (int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]: " + str[i]);
    }
}
