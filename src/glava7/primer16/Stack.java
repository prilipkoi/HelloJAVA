package glava7.primer16;
/**
 * Created by prilipko.ia on 11.09.2018.
 */
// усовершенствованный класс Stack, в котором использован член длинны массива

public class Stack {
    private int stck[];
    private int tos;

    // выделить память под стек и инициализировать его

    Stack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке

    void push(int item) {
        if(tos == stck.length-1) { // используем член длины массива
            System.out.println("Стек заполнен");
        } else {
            stck[++tos] = item;
        }
    }

    // извлечь элемент из стека

    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class TestStack {
    public static void main(String[] args) {
        Stack mystack1 = new Stack(5);
        Stack mystack2 = new Stack(8);

        // размещаем числа в стеке

        for(int i = 0; i < 5; i++) mystack1.push(i);
        for(int i = 0; i < 8; i++) mystack2.push(i);

        // извлекаем числа из стека

        System.out.println("Стек mystack1:");
        for (int i = 0; i < 5; i++) {
            System.out.println(mystack1.pop());
        }

        System.out.println("Стек mystack2:");
        for(int i = 0; i < 8; i++){
            System.out.println(mystack2.pop());
        }
    }
}
