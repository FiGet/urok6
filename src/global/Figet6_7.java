package global;
import java.util.Scanner;
public class Figet6_7 {
    public static int number;
    public static int[] array;
        //задание 7
    public static void main(String[] args) {
        newarray();
        createarray();
        printarray();

    }
        static void newarray () {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите размерность одномерного массива ");
            int number = scanner.nextInt();
            int[] array = new int[number];
        }
        static void createarray() {
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < number; i++) {
                System.out.println("Введите число");
                int aNumber = scanner.nextInt();
                array[i] = aNumber;
            }
        }
        static void printarray () {
            for(int j = 0; j < number; j++) {
            System.out.println(array[j]);
        }
    }
}