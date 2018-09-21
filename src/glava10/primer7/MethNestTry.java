package glava10.primer7;

/**
 * Created by prilipko.ia on 21.09.2018.
 */
// Операторы try могут неявно вложены в вызовы методов

public class MethNestTry {
    static void nesttry(int a) {
        try {
//            если указан один аргумент командной строки, то исключение будет сгенерировано в связи с делением на нуль
            if(a == 1) {
                a = a / (a - a);    // деление на нуль.
            }
//            если указано 2 аргумента командной строки, то генерируется исключение в связи с выходом за пределы массива.
            if(a == 2) {
                int c[] = {1};
                c[42] = 99;     // здесь генерируется исключение выхода за пределы массива
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Индекс за пределами массива: " + e);
        }
    }
    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a = " + a);
            nesttry(a);
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}


