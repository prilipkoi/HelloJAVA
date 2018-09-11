package glava7.primer24;

/**
 * Created by prilipko.ia on 11.09.2018.
 */
// Аргументы переменной длины

public class VarArgs {
    // теперь метод VaTest() объявляется с аргументами переменной длины

    static void vaTest(int ... v) {
        System.out.print("Количество аргументов: " + v.length + " Содержимое: ");
        for(int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //обратить внимание на возможные способы вызова метода vaTest() с аргументами переменной длины
        vaTest(10); // 1 аргумент
        vaTest(1, 2, 3); // 3 аргумента
        vaTest(); // без аргументов
    }
}
