package global;
        import java.util.Scanner;
public class Figet {
    public static void main(String[] args) {
        //задание 9
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите число: ");
        int number = scanner.nextInt();
        if ( number % 2 == 0 )
            System.out.println("Число четное");
        else
            System.out.println("Число нечетное");
        //задание 10
        int day;
        try (Scanner scanner1 = new Scanner(System.in)) {
            System.out.print("Ввведите номер дня недели: ");
            day = scanner1.nextInt();
        }
        switch (day) {
            case 1:
                System.out.print("День недели - понедельник");
                break;
            case 2:
                System.out.print("День недели - вторник");
                break;
            case 3:
                System.out.print("День недели - среда");
                break;
            case 4:
                System.out.print("День недели - четверг");
                break;
            case 5:
                System.out.print("День недели - пятница");
                break;
            case 6:
                System.out.print("День недели - суббота");
                break;
            case 7:
                System.out.print("День недели - воскресенье");
                break;
            default:
                System.out.print("Некорректно введен номер дня недели");
        }

    }
}