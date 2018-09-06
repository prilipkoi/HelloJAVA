package glava6.primer6;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
class Box {
    double width;
    double height;
    double depth;

    Box(){
        System.out.println("Конструирование объекта Box");
        width = 10;
        height = 10;
        depth = 10;
    }
    //посчитать и вывести объем параллелепипеда
    double volume() {
        return width * height * depth;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        // объявить, выделить память и инициализировать объекты типа Box

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        double vol;

        // получим объем первого параллелепипеда:

        vol = mybox1.volume();
        System.out.println("Объем равен: " + vol);

        // получим объем второго параллелепипеда:

        vol = mybox2.volume();
        System.out.println("Объем равен: " + vol);

    }
}
