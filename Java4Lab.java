import java.util.Scanner;

public class Java4Lab {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введіть ваше ім'я: ");
            String name = scanner.nextLine();

            System.out.print("Введіть ваш вік: ");
            int age = scanner.nextInt();

            // Вивід введених даних
            System.out.println("Привіт, " + name + "!");
            System.out.println("Вам " + age + " років.");

            // Виклик методу для виведення повідомлення
            printMessage("Це простий приклад Java програми.");

            // Виклик методу для обчислення суми
            int result = addNumbers(5, 7);
            System.out.println("Сума чисел 5 і 7 дорівнює: " + result);
        }
    }

    // Метод для виведення повідомлення
    public static void printMessage(String message) {
        System.out.println(message);
    }

    // Метод для обчислення суми двох чисел
    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
