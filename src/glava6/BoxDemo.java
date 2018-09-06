package glava6;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
class Box {
    double width;
    double height;
    double depth;

    //вывести объем параллелепипеда
    double volume() {
        return width * height * depth;
    }

    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
}

class BoxDemo {
    public static void main(String[] args) {
        Box mybox = new Box();
        double vol;

        // Присваиваем значение переменным экземпляра mybox
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;

        // Рассчитаем объем параллелепипеда

        vol = mybox.width * mybox.height *mybox.depth;
        System.out.println("Объем равен: " + vol);
    }
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

class BoxDemo3 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();

        // присваиваем значения переменным экземпляра mybox1

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        // присваиваем другие значения переменным экземпляра mybox2

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        // выведем объем первого параллелепипеда:

        mybox1.volume();

        // выведем объем второго параллелепипеда:

        mybox2.volume();
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

class BoxDemo5 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;

        // инициализируем каждый экземпляр класса Box

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);

        // получаем объем параллелепипедов

        vol = mybox1.volume();
        System.out.println("Объем равен: " + vol);

        vol = mybox2.volume();
        System.out.println("Объем равен: " + vol);
    }
}
