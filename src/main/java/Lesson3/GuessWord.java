package Lesson3;


import java.util.Scanner;


public class GuessWord {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        int n = (int) (Math.random() * words.length);
        Scanner scanner = new Scanner(System.in);
        String word, concword;
        do {
            System.out.println("Угадайте слово!");
            word = scanner.nextLine();
            concword = words[n];
            for (int i = 0; i < Math.min(word.length(), concword.length()); i++) {
                if (word.charAt(i) == concword.charAt(i)) {
                    System.out.print(word.charAt(i));
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("\n");
            if (!word.equals(concword)) {
                System.out.print("***\n");
            }
        } while (!word.equals(concword));
        System.out.println("Вы выиграли! Это слово: " + concword);
    }
}
