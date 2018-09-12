package glava8.primer6;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
// Расширение класса BoxWeight включением в него поля стоимости доставки
public class Box {
    private double width;
    private double height;
    private double depth;

//    сконструировать клон объекта
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

//    конструктор, применяемый при указании всех параметров
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

//    конструктор, применяемый при отсутсвии параметров
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

//    конструктор куба
    Box(double len) {
        width = height = depth = len;
    }

    double volume() {
        return width * height * depth;
    }
}
class BoxWeight extends Box {
    double weight;

//    сконструировать клон объекта
    BoxWeight(BoxWeight ob){
        super(ob);
        weight = ob.weight;
    }

//    конструктор, применяемый при указании всех параметров
    BoxWeight(double w, double h, double d, double m) {
        super(w,h,d);
        weight = m;
    }

//    конструктор, применяемый при отсутсвии параметров
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

// добавляем поле стоимости доставки

class Shipment extends BoxWeight {
    double cost;


//    сконструировать клон объекта
    Shipment (Shipment ob) {
        super(ob);
        cost = ob.cost;
    }

//    конструктор, применяемый при указании всех параметров
    Shipment(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

//    конструктор, применяемый при отсутсвии параметров
    Shipment() {
        super();
        cost = -1;
    }

//    конструктор куба
    Shipment(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
        double vol;

        vol = shipment1.volume();
        System.out.println("Объем shipmernt1 равен: " + vol);
        System.out.println("Вес shipment1 равен: " + shipment1.weight);
        System.out.println("Стоимость доставки $; " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Объем shipmernt1 равен: " + vol);
        System.out.println("Вес shipment1 равен: " + shipment2.weight);
        System.out.println("Стоимость доставки $; " + shipment2.cost);
        System.out.println();
    }
}
