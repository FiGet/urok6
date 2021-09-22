package global;
import java.util.Scanner;
public class Figet5_10 {
    public static void main(String[] args) {
        //задание 10
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк двумерного массива ");
        int number1 = scanner.nextInt();
        System.out.print("Введите количество столбцов двумерного массива ");
        int number2 = scanner.nextInt();
        int[][] array = new int[number1][number2];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = array[i][j] + k + 1;
                k = array[i][j];
                System.out.print("" + array[i][j] + "");
            }
            System.out.println();
        }

    }
}