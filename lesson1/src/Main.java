//public class Main {
//
//    public static void main(String[] args) {
//        int a = 5;
//        int b = 4;
//        int c = 3;
//        int d = 2;
//        int e = a*(b+(c/d));
//        System.out.println("Результат -- " + e);
//    }
//}

//--------------------------------------------------------------------------------


//public class Main {
//    public static void main(String[] args) {
//        System.out.println("           _..---...,\"\"-._     ,/}/)\n" +
//                "        .''        ,      ``..'(/-<\n" +
//                "       /   _      {      )         \\\n" +
//                "      ;   _ `.     `.   <         a(\n" +
//                "    ,'   ( \\  )      `.  \\ __.._ .: y\n" +
//                "   (  <\\_-) )'-.____...\\  `._   //-'\n" +
//                "    `. `-' /-._)))      `-._)))\n" +
//                "      `...'         ");
//    }
//}

//--------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//        int a = 1, b = 8, c = a + b;
//        if (c > 10 && c < 20) {
//            System.out.println("Число больше 10 и меньше 20");
//        }else {
//            System.out.println("Число меньше 10 и больше 20");
//        }
//    }
//}

//--------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//        int a = 15, b = 10;
//
//        if (a >= 0){
//            System.out.println("Число  " + a + " положительное");
//        }else {
//            System.out.println("Число  " + a + " отрицательное");
//        }
//        if (b >= 0){
//            System.out.println("Число  " + b + " положительное");
//        }else {
//            System.out.println("Число  " + b + " отрицательное");
//        }
//        if (a >= 0 && b >= 0){
//            System.out.println("Два числа  " + a + " " + b + " положительные");
//        }
//    }
//}

//--------------------------------------------------------------------------------
//                                                                               №7
//public class Main {
//
//    public static void main(String[] args) {
//        String a = "Kirill";
//        System.out.println("Привет! Рад тебя видеть " + a);
//
//    }
//}

//--------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//        int a = 6, b = 7;
//
//        if (a == 5) {
//            System.out.println("                    ");
//            System.out.println("Ваш порядковый номер " + a);
//        }else if (b == 7) {
//            System.out.println("                    ");
//            System.out.println("Ваш порядковый номер " + b);
//        }else {
//            System.out.println("                    ");
//            System.out.println("У вас нет подходящего номера");
//        }
//    }
//}

//--------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//
//        int i = 19; // Целые
//
//        double x = i % 2;
//        System.out.println("i mod 10 = " + i % 10);
//        System.out.println("x = " + x);
//
//        if(x == 0) {
//            System.out.println("i = чётное" );
//        }
//
//
//    }
//}

//        if(a == 0 && b == 0 ){
//            if(c == 0) {
//                System.out.println("Год високосный");
//            } else {
//                System.out.println("Не високосный");
//            }
//        } else if(a == 0 && b != 0) {
//            System.out.println("Год високосный");
//        } else {
//            System.out.println("Не високосный");
//        }
//+++++++++++++++++++++++++++++++++++++++++++++++++++
//Рабочий код
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("---------------");
        System.out.println("Введите год: ");
        System.out.println("---------------");
        int year = s.nextInt();
        double a = year % 4;
        double b = year % 100;
        double c = year % 400;

        if (a == 0 && b != 0 || c == 0) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Не високосный");
        }
    }
}
//+++++++++++++++++++++++++++++++++++++++++++++++++++

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число: ");
//        if (scanner.hasNextInt()) {
//            int i = scanner.nextInt();
//            System.out.println(i);
//        } else {
//            System.out.println("Вы ввели не целое число");
//        }
//    }
//}

//--------------------------------------------------------------------------------














