package glava10.primer6;

/**
 * Created by prilipko.ia on 21.09.2018.
 */
// Пример применения вложенных операторов try
public class NestTry {
    public static void main(String[] args) {
        try {
            int a = args.length;

//            Если не указаны аргументы командной строки, в следующем операторе будет сгенерировано исключение в связи с делением на нуль.
            int b = 42 / a;

            System.out.println("a = " + a);

            try {
                //  вложенный блок try, если указан один аргумент командной строки, то исключение в связи с делением на нуль будет сгенерировано в следующем коде
                if(a == 1) {
                    a = a/(a-a);
                }
                //
                if(a == 2) {
                    int c[] = {1};
                    c[42] = 99; //здесь сгенерируется исколючение в связи с выходом за пределы массива
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
