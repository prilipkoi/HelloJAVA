package glava8.primer3;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
// в этом примере наследование применяется для расширения класса Box

public class Box {
    double width;
    double height;
    double depth;

    Box(Box ob) { // передать объект конструктору
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

//    конструктор, применяемый в отсутствии размеров

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

//    конструктор, применяемый для создания куба

    Box(double len) {
        width = height = depth = len;
    }

//    рассчитать и возратить объем
    double volume() {
        return width * height * depth;
    }
}

// Расширим класс Box, включив в него поле веса

class BoxWeight extends Box {
    double weight; // вес параллелепипеда

//    конструктор BoxWeight

    BoxWeight(double w, double h, double d, double m) {
        width = w;
        height = h;
        depth = d;
        weight = m;
    }
}

class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight mybox2 = new BoxWeight(2,3,4,0.076);
        double vol;

        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен: " + vol);
        System.out.println("Вес mybox1 равен: " + mybox1.weight);

        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен: " + vol);
        System.out.println("Вес mybox1 равен: " + mybox2.weight);
    }
}

class ColorBox extends Box {
    int color;

    ColorBox(double w, double h, double d, int c) {
        width = w;
        height = h;
        depth = d;
        color = c;
    }
}