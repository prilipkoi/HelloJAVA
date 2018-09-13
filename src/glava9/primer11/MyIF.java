package glava9.primer11;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public interface MyIF {
// Это объявление обычного метода в интерфейсе. Он НЕ предоставляет реализацию по умолчанию
    int getNumber();

//    А это объявление метода по умолчанию. Внимание на реализацию по умолчанию:
    default String getString(){
        return "Объект типа String по умолчанию";
    }
}
