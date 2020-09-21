package Lesson3;


import java.util.Scanner;

public class GuessNumber {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNum();
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int again = scanner.nextInt();
            if (again == 1) {
                GuessNum();
            } else if (again == 0) {
                break;
            } else {
                System.out.println("Неверный тип данных!");
                break;
            }
        } while (true);
    }

    public static void GuessNum() {
        int number = (int) (Math.random() * 9);
        System.out.println(number);
        int tries = 3;
        for (int i = 0; i < tries; i++) {
            System.out.println("Угадайте число, у вас есть " + (tries - i) + " попытки!");
            int user_num = scanner.nextInt();
            if (user_num > number) {
                System.out.println("Меньше");
                continue;
            } else if (user_num < number) {
                System.out.println("Больше");
                continue;
            } else if (user_num == number) {
                System.out.println("Вы выиграли, это число: " + number + "!");
                break;
            } else {
                System.out.println("Неверный тип данных!");
                break;
            }
        }
    }
}
