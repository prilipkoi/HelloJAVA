package glava7.primer3;

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

    // конструктор, используемый, когда ни один из размеров не указан

    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }

    // конструктор, используемый для создания куба

    Box(double len){
        width = height = depth = len;
    }
    // посчитать и озвратить объем
    double volume() {
        return width * height * depth;
    }
}

class OverloadCons {
    public static void main(String[] args) {
        // создадим параллелепипеды, используя разные конструкторы

        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        double vol;

        // получим объем первого параллелепипеда

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен: " + vol);

        // получим объем второго параллелепипеда

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен: " + vol);

        // получим объем куба

        vol = mycube.volume();
        System.out.println("Объем mycube равен: " + vol);
    }
}