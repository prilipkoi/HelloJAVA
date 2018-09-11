package glava7.primer5;

/**
 * Created by prilipko.ia on 11.09.2018.
 */
public class Box {
    double width;
    double height;
    double depth;

    // в этом конструкторе в качестве параметра используется объект типа Box

    Box(Box ob) { //передать объект конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // конструктор используемый при указании всех размеров

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // конструктор, используемый, если ни один из параметров не указан

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор для куба

    Box(double len) {
        width = height = depth = len;
    }

    // Рассчет и возврат объема

    double volume() {
        return width * height * depth;
    }
}

class OverloadCons2 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box myclone = new Box(mybox1);

        // создаем копию объекта Mybox1

        double vol;

        // получим объем первого параллелелпипеда
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен: " + vol);

        // получим объем второго параллелелпипеда

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен: " + vol);

        // получим объем куба

        vol = mycube.volume();
        System.out.println("Объем mycube равен: " + vol);

        // получим объем клона

        vol = myclone.volume();
        System.out.println("Объем myclone равен:" + vol);
    }
}