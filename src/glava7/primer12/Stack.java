package glava7.primer12;

/**
 * Created by prilipko.ia on 11.09.2018.
 */
// в этом классе определяется целочисленный стек, который может содержать 10 значений

public class Stack {
    /* теперь переменные stck и tos являются закрытыми
    это означает, что они не могут быть случайно или
    намеренно изменены таким образом, чтобы нарушить стек
     */

    private int stck[] = new int[10];
    private int tos;

    // инициализируем вершину стека
    Stack() {
        tos = -1;
    }

    // разместить элемент в стеке

    void push(int item) {
        if(tos == 9) {
            System.out.println("Стек заполнен");
        } else {
            stck[++tos] = item;
        }
    }

    // извлекаем элемент из стека

    int pop() {
        if(tos < 0) {
            System.out.println("Стек не загружен");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}
