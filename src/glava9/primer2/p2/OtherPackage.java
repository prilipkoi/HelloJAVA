package glava9.primer2.p2;

import glava9.primer2.p1.Protection;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public class OtherPackage {
    public OtherPackage() {
        glava9.primer2.p1.Protection p = new glava9.primer2.p1.Protection();
        System.out.println("Конструктор из другого пакета");

//        доступно только для данного класса или пакета
//        System.out.println("n = " + p.n);

//        доступно только для данного класса
//        System.out.println("n_pri = " + p.n_pri);

//        доступно только для данного класса, подкласса или пакета
//        System.out.println("n_pro = " + p.n_pro);

        System.out.println("n_pub = " + p.n_pub);
    }
}
