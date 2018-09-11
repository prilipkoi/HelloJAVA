package glava7.primer7;

/**
 * Created by prilipko.ia on 11.09.2018.
 */

// объекты передаются по ссылке на них

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // передать объект

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class PassObjRe {
    public static void main(String[] args) {
        Test ob = new Test(15, 20);
        System.out.println("ob.a и ob.b до вызова: " + ob.a + " " + ob.b);

        ob.meth(ob);

        System.out.println("ob.a и ob.b после вызова: " + ob.a + " " + ob.b);
    }
}
