package global;
import java.util.Scanner;
public class Figet5_9 {
    public static void main(String[] args) {
        //задание 9
        int k = 0;
        if (args.length == 0) {
            System.out.println("Вы не передали аргументы");
        } else {
            for (String arg : args) {
                int var = Integer.parseInt(arg);
                String str = String.valueOf(var);
                k = k + var;
            }
            System.out.println(k);
        }
    }
}