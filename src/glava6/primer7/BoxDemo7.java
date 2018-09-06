package glava6.primer7;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
class Box {
    double width;
    double height;
    double depth;

    // конструктор класса Box
    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
    // посчитать и вывести объем параллелепипеда
    double volume() {
        return width * height * depth;
    }
}

public class BoxDemo7 {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);

        double vol;

        // получаем объем первого параллелепипеда

        vol = mybox1.volume();
        System.out.println("Объем равен: " + vol);

        // получаем объем второго параллелепипеда

        vol = mybox2.volume();
        System.out.println("Объем равен: " + vol);
    }
}
