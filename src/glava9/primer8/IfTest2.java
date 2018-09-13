package glava9.primer8;

/**
 * Created by prilipko.ia on 13.09.2018.
 */
public class IfTest2 {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

//        в этих циклах увеличиваем размеры каждого стека

        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.println("Стек mystack1:");
        for (int i = 0; i < 12; i++) System.out.println(mystack1.pop());

        System.out.println("Стек Mystack2:");
        for (int i = 0; i < 20; i++) System.out.println(mystack2.pop());
    }
}
