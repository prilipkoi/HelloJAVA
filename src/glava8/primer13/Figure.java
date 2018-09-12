package glava8.primer13;

/**
 * Created by prilipko.ia on 12.09.2018.
 */
// Применение абстрактных методов и классов
abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

//    теперь метод area() объявляется абстрактным
    abstract double area();
}

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

//    переопределим метод area() для четырехугольника

    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области треугольника");
        return dim1 * dim2 / 2;
    }
}

class AbstractAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10)  // теперь недопустимо
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;  // верно, но объект не создается

        figref = r;
        System.out.println("Площадь равна: " + figref.area());

        figref = t;
        System.out.println("Площадь равна: " + figref.area());
    }
}
