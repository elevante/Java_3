package ru.mail;


import java.util.Random;
import java.util.Scanner;

public class JavaApp {
    public static void main(String[] args) {
        guessApp();
        while (true){
            System.out.println("Повторить игру еще раз? 1 - да / 0 - нет");
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            if (k == 1)
                guessApp();
            else break;
        }
    }
    /*
          Practice 1. Написать программу, которая загадывает случайное число от 0 до 9
          и пользователю дается 3 попытки угадать это число.
          При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
          После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
     */
    public static void guessApp(){
        int attempt = 3;
        Random rand = new Random();
        int x = rand.nextInt(10);
        for (int i = 0; i < 3; i++){
            System.out.printf("Угадайте число от 0 до 9.\nВсего попыток %d.\nВведите число: ", attempt--);
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            if(a == x) {
                System.out.println("Вы угадали! Игра окончена");
                break;
            } else if (a > x) {
                System.out.println("Введенное число больше загаданного.");
            } else if (a < x)
                System.out.println("Введенное число меньше загаданного.");
        }
    }
}
