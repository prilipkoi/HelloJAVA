package glava9.primer2.p2;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public class Protection2 extends glava9.primer2.p1.Protection {

    Protection2() {
        System.out.println("Конструктор, унаследованный из другого пакета");

//        доступно только для данного класса или пакета
//        System.out.println("n = " + n);

//        доступно только для данного класса
//        System.out.println("n_pri = " + n_pri);

        System.out.println("n_pro = " + n_pro);
        System.out.println("n_pub = " + n_pub);
    }
}
