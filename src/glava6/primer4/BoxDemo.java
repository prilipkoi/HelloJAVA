package glava6.primer4;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
class Box {
    double width;
    double height;
    double depth;

    //посчитать и вывести объем параллелепипеда
    double volume() {
        return width * height * depth;
    }

}

class BoxDemo4 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // присваиваем значения переменным экземпляра mybox1

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присваиваем другие значения переменным экземпляра mybox2

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // получим объем первого параллелепипеда:

        vol = mybox1.volume();
        System.out.println("Обхем равен: " + vol);

        // получим объем первого параллелепипеда:

        vol = mybox2.volume();
        System.out.println("Обхем равен: " + vol);
    }
}

