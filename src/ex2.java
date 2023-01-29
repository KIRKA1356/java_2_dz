import java.util.Scanner;
import java.util.logging.Logger;

public class ex2 {
    public static void main(String[] args) {
        double num1;
        double num2;
        double ans;
        char op;
        Logger log = Logger.getAnonymousLogger();
        Scanner reader = new Scanner(System.in);
        System.out.println("Ввведите два числа: ");
        num1 = reader.nextDouble();
        num2 = reader.nextDouble();
        log.info("Введены числа");
        System.out.print("\nВведите оператор действия (+, -, *, /): ");
        op = reader.next().charAt(0);
        log.info("введен оператор действия");
        switch (op) {
            case '+':
                ans = num1 + num2;
                break;
            case '-':
                ans = num1 - num2;
                break;
            case '*':
                ans = num1 * num2;
                break;
            case '/':
                ans = num1 / num2;
                break;
            default:
                System.out.printf("Ошибка! Неверный оператор!");
                log.warning("Ошибка! Неверный оператор!");
                return;
        }
        System.out.print("\nЭто результат вашего действия:\n");
        System.out.printf(num1 + " " + op + " " + num2 + " = " + ans);
        log.info("Получен результат!");
    }
}


