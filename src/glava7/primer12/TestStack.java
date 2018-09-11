package glava7.primer12;

/**
 * Created by prilipko.ia on 11.09.2018.
 */
public class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // размещаем числа в стеке

        for(int i = 0; i < 10; i++) mystack1.push(i);
        for (int i = 10; i < 20; i++) mystack2.push(i);

        // извлекаем числа из стека

        System.out.println("Стек mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop());

        System.out.println("Стек mystack2:");

        for(int i = 0; i < 10; i++)
            System.out.println(mystack2.pop());

        // эти операторы недопустимы:
        // mystack1.tos = -2;
        // mystack2.stck[3] = 100;
    }
}
