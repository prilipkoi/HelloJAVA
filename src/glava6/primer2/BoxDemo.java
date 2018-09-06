package glava6.primer2;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
class Box {
    double width;
    double height;
    double depth;

}

class BoxDemo2 {
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

        // рассчитаем объем первого параллелепипеда:

        vol = mybox1.width * mybox1.height * mybox1.depth;
        System.out.println("Объем равен " + vol);

        // рассчитаем объем второго параллелепипеда:

        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Объем равен: " + vol);
    }
}

