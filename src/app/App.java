package app;

import java.util.Scanner;

public class App {

    final static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        greet("NiceBot", "2019");
        remindName();
        guessAge();
        count();
        test();
        end();
    }

    public static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    public static void remindName() {
        String name = in.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    public static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say me remainders of dividing your age by 3, 5 and 7.");
        int rem3 = in.nextInt();
        int rem5 = in.nextInt();
        int rem7 = in.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    public static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = in.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    public static void test() {

        System.out.println("Find the correct answer.");
        System.out.println("Which one is not a programming language ?");

        System.out.println("1. Javascript");
        System.out.println("2. Dart");
        System.out.println("3. Python");
        System.out.println("4. Flutter");

        String answer = in.next();
        in.nextLine();

        while (!answer.equals("4")) {
            System.out.println("Please, try again.");
            answer = in.nextLine();

        }

    }

    public static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}
