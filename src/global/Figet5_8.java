package global;
import java.util.Scanner;
public class Figet5_8 {
    public static void main(String[] args) {
        //задание 8
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк двумерного массива ");
        int number1 = scanner.nextInt();
        System.out.print("Введите количество столбцов двумерного массива ");
        int number2 = scanner.nextInt();
        int[][] array = new int[number1][number2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                System.out.print("Введите элемент массива[" + i + "][" + j + "]:");
                array[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("" + array[i][j] + "");
            }
                System.out.println();
            }

           }
}