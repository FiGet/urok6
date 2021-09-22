package global;
import java.util.Scanner;
public class Figet5_7 {
    public static void main(String[] args) {
        //задание 7
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность одномерного массива ");
        int number = scanner.nextInt();
        int[] array = new int [number];
            for(int i=0; i<number; i++){
            System.out.println("Введите число");
            int a_number = scanner.nextInt();
            array[i] = a_number;
        }
        for(int j=0; j<number; j++) {
            System.out.println(array[j]);
        }
    }
}