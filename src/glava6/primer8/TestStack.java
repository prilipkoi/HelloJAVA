package glava6.primer8;

/**
 * Created by prilipko.ia on 06.09.2018.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        // извлечь числа из стека
        System.out.println("Содержимое стека mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Содержимое стека mystack2:");
        for (int i = 0; i < 10; i++)
                System.out.println(mystack2.pop());
    }
}
