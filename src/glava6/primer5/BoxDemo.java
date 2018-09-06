package glava6.primer5;

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

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
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

