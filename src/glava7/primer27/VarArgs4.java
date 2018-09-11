package glava7.primer27;

/**
 * Created by prilipko.ia on 11.09.2018.
 */
// Аргументы переменной длины, перегрузка и неоднозначность
    // эта программа не может быть скомпилирована, если разкоментировать строку 30

public class VarArgs4 {
    static void vaTest(int ... v) {
        System.out.print("vaTest(int ...): " + "количество аргументов: " + v.length + " Содержимое: " );

        for(int x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ...): " + "количество аргументов: " + v.length + " Содержимое: " );

        for(boolean x : v) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, false);
        //vaTest(); // Ошибка: неоднозначность!
    }
}
