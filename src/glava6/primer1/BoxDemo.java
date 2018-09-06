package glava6.primer1;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
class Box {
    double width;
    double height;
    double depth;



     Box() {
         width = 10;
         height = 10;
         depth = 10;
    }

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

