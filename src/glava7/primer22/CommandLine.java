package glava7.primer22;

/**
 * Created by prilipko.ia on 11.09.2018.
 */
public class CommandLine {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
