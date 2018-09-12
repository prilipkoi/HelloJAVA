package glava8.primer4;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
public class Box {
    private double width;
    private double height;
    private double depth;

//    конструктор клон объекта
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

//    конструктор, применяемый при указании всех размеров

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

//    конструктор, применяемый при отсутсвии размеров

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

//    конструктор, применяемый при создании куба

    Box(double len) {
        width = height = depth = len;
    }

//    рассчет и возврат объема

    double volume() {
        return width * height *depth;
    }
}

// Теперь в классе BoxWeight полностью реализованы все конструкторы

class BoxWeight extends Box {
    double weight; // вес параллелепипеда

//    сконстрруировать клон объекта

    BoxWeight(BoxWeight ob) { // передать объект конструктору
        super(ob);
        weight = ob.weight;
    }

//    конструктор, применяемый при указании всех параметров

    BoxWeight(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

//    конструктор, применяемый по умолчанию

    BoxWeight() {
        super();
        weight = -1;
    }

//    конструктор куба

    BoxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3,2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен: " + vol);
        System.out.println("Вес mybox1 равен: " + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен: " + vol);
        System.out.println("Вес mybox2 равен: " + mybox2.weight);
        System.out.println();

        vol = mybox3.volume();
        System.out.println("Объем mybox3 равен: " + vol);
        System.out.println("Вес mybox3 равен: " + mybox3.weight);
        System.out.println();

        vol = myclone.volume();
        System.out.println("Объем myclone1 равен: " + vol);
        System.out.println("Вес myclone равен: " + myclone.weight);
        System.out.println();

        vol = mycube.volume();
        System.out.println("Объем mycube равен: " + vol);
        System.out.println("Вес mycube равен: " + mycube.weight);
        System.out.println();
    }
}