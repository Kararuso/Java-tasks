
//Рандомайзер и угадыватель чисел

import java.util.Scanner;
import java.util.Random;

public class Casual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int win = 0;
        int tf = 1;

        System.out.println("-------------------------");
        System.out.println("Угадайте число от 1 до 10");
        System.out.println("Напишите число");
        int a = new Random().nextInt(10);
        System.out.println("Загаданое число " + a);
        do {
            int t = 3;
            while (t > 0) {

                int b = input.nextInt();

                if (a == b){
                    System.out.println("Поздравляю вы угадали");
                    System.out.println("Игра окончена");
                    System.out.println("--------------------");

                    while (tf == 1) {
                        System.out.println("Начать заново?");
                        String q = sc.nextLine();

                        Boolean resYes = q.equals("да");
                        Boolean resNo = q.equals("нет");

                        if (resYes) {
                            tf = 0;
                            win = 1;
                            break;
                        } else if (resNo) {
                            System.out.println("Игра окончена. Спасибо за игру");
                            tf = 2;
                            win = 0;
                            break;
                        } else{
                            System.out.println("Не понятно");
                            tf = 1;
                        }
                    }
                    break;
                }else if(a > b){
                    System.out.println("Вы не угадали! Число больше");
                }else {
                    System.out.println("Вы не угадали! Число меньше");
                }
                t--;
            }
            if (t == 0) {
                System.out.println("--------------------");
                System.out.println("Попытки закончились");
                System.out.println("--------------------");

                tf = 1;

                while (tf == 1) {
                    System.out.println("Начать заново?");

                    String q = sc.nextLine();

                    Boolean resYes = q.equals("да");
                    Boolean resNo = q.equals("нет");

                    if (resYes) {
                        tf = 0;
                        win = 1;
                        System.out.println(q);
//                        break;
                    } else if (resNo) {
                        System.out.println("Игра окончена. Спасибо за игру");
                        tf = 2;
                        win = 0;
                        break;
                    } else{
                        System.out.println("Не понятно");
                        tf = 1;
                    }
                }
            }
        }while (win == 1);
    }
}



