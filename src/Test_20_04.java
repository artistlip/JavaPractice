import java.util.Scanner;

public class Test_20_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double speed = 300;
        System.out.println("Скорость эхо = " + speed + " метров в секунду");
        while (true) {
            System.out.println("Введите время возврата эхо в секундах или 0 для выхода:");
            double time = scanner.nextDouble();
            if (time != 0) {
                double dist = speed * time / 2;
                System.out.println("Расстояние до объекта = " + dist + " метров");
            } else {
                System.out.println("Выход");
                break;
            }
        }
        scanner.close();
    }
}
