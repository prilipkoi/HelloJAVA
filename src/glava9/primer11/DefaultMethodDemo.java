package glava9.primer11;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public class DefaultMethodDemo {
    public static void main(String[] args) {

        MyIFImp obj = new MyIFImp();

//        Метод getNumber() можно вызвать, т.к. он явно реализован в классе MyIFImp

        System.out.println(obj.getNumber());

//        Метод getString() тоже можно вызвать, т.к. в интерфейсе имеется его реализация по умолчанию

        System.out.println(obj.getString());
    }
}
