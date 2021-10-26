//public class Main {
//    public static void main(String[] args) {
//
//        int hours = 5;
//        int rounds = 1;
//        String time = "час";
//        do {
//            if (hours == 1){
//                time = "час";
//            } else if (hours >= 2 && hours <= 4){
//                time = "часа";
//            }else {
//                time = "часов";
//            }
//            System.out.println("----------------------------------");
//            System.out.println("Осталось играть " + hours + " " + time);
//            while (rounds <= 3){
//                System.out.println("игра " + rounds);
//                System.out.println("win");
//                rounds++;
//            }
//            hours--;
//            rounds = 1;
//        }while (hours > 0);
//    }
//}

//----------------------------------------------------------------------------------------------------------------------

//public class Main {
//    public static void main(String[] args) {
//        int[]  gamehours = new int[5];
//        gamehours[0] = 14;
//        gamehours[1] = 12;
//        gamehours[2] = 55;
//
//        System.out.println(gamehours[0]);
//    }
//}

//Изменить 1 на 0, 0 на 1
//public class Main {
//    public static void main(String[] args) {
//
//
//        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
//
//        for (int i = 0; i < numbers.length; i++) {
//
//            if (numbers[i] == 1 ){
//                numbers[i] = 0;
//            } else if (numbers[i] == 0){
//                numbers[i] = 1;
//            }
//            System.out.print(numbers[i] + " ");
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------
//        {0, 3, 6, 9, 12, 15, 18, 21}

//public class Main {
//    public static void main(String[] args) {
//
//        int[] numbers = new int[8];
//
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = i * 3;
//            System.out.print(numbers[i] + " ");
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

//Умножить на 2 числа меньшие 6
//public class Main {
//    public static void main(String[] args) {
//        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 6){
//                numbers[i] *= 2;
//            }
//            System.out.print(numbers[i] + " ");
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

//Диагонали
//public class Main {
//    public static void main(String[] args) {
//
//        int[][] n = new int[11][11];
//
//        for (int i = 0; i < n.length; i++) {
//            for (int j = 0; j < n[i].length; j++) {
//                if (i == j){
//                    n[i][j] = 1;
//                } else if (i + j == n.length - 1){
//                    n[i][j] = 1;
//                }
//                System.out.print(n[i][j] + " ");
//            }
//            System.out.println("");
//        }
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

//Находить максимальное и минимальное в одномерном массиве
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Напишите все ваши числа");
//
//        int size = 8;
//
//        int arr[] = new int[size];
//
//        for (int i = 0; i < size; i++) {
//            arr[i] = input.nextInt();
//        }
//
//        for (int i = 0; i < size; i++) {
//            System.out.print(" " + arr[i]);
//        }
//        System.out.println();
//
//        int max = FindMax(arr);
//        int min = FindMin(arr);
//
//        System.out.println("-------------------------");
//        System.out.println("Max : " + max);
//        System.out.println("Min : " + min);
//        System.out.println("-------------------------");
//    }
//
//    static int FindMax(int arr[]) {
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    static int FindMin(int arr[]) {
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }
//}
//----------------------------------------------------------------------------------------------------------------------

//Делитель на две равные части одномерного массива

//public class Main {
//    public static void main(String[] args) {
//
//        int[] arr = {8, 21, 1, 12, 15, 3};
//        checkBalance(arr);
//    }
//
//    static boolean checkBalance(int[] arr){
//        boolean a = false;
//        int amnt1 = 0;
//        int amnt2 = 0;
//        for (int w = 0; w < arr.length; w++){
//            amnt1 += arr[w];
//        }
//        for (int j = 0; j < arr.length; j++){
//            amnt1 -= arr[j];
//            amnt2 += arr[j];
//            if (amnt1 == amnt2) {
//                a = true;
//                break;
//            }
//        }
//        System.out.println("==============");
//        System.out.println(a);
//        System.out.println("==============");
//        return a;
//    }
//}
//    static boolean checkBalance(int[] arr){
//        boolean a = false;
//        int amnt1 = 0;
//        int amnt2 = 0;
//        for (int w = 0; w < arr.length; w++){
//            amnt1 += arr[w];
//        }
//        for (int j = 0; j < arr.length; j++){
//            amnt1 -= arr[j];
//            amnt2 += arr[j];
//            if (amnt1 == amnt2) {
//                a = true;
//                break;
//            }
//        }
//        System.out.println(a);
//        System.out.println("=============================");
//        return a;
//    }
//}

//import java.util.stream.IntStream;
//
//public class Main {
//    public static void main(String[] args) {
//        int[] arr = {2, 2, 2, 1, 2, 2, 10, 1}; //Максимально 8 чисел в массиве
//
//        int total = IntStream.of(arr).sum();
//        System.out.println(total);
//
//        int arr2 = arr[1]+ arr[2]+ arr[3]+ arr[4] + arr[5] + arr[6] + arr[7];   //20
//        System.out.println(arr2 + " - Arr2");
//
//        int arr3 = arr[2]+ arr[3]+ arr[4] + arr[5] + arr[6] + arr[7]; //18
//        System.out.println(arr3 + " - Arr3");
//
//        int arr4 = arr[3]+ arr[4] + arr[5] + arr[6] + arr[7]; // 16
//        System.out.println(arr4 + " - Arr4");
//
//        int arr5 = arr[4] + arr[5] + arr[6] + arr[7]; //
//        System.out.println(arr5 + " - Arr5");
//
//        int arr6 = arr[5] + arr[6] + arr[7]; //
//        System.out.println(arr6 + " - Arr6");
//
//        int arr7 = arr[6] + arr[7]; //
//        System.out.println(arr7 + " - Arr7");
//
//        if (arr2 == (total - arr2)){
//            System.out.println("Равны две части : " + (total - arr2) + " и " + arr2);
//        } else if (arr3 == (total - arr3)) {
//            System.out.println("Равны две части : " + (total - arr3) + " и " + arr3);
//        } else if (arr4 == (total - arr4)) {
//            System.out.println("Равны две части : " + (total - arr4) + " и " + arr4);
//        } else if (arr5 == (total - arr5)) {
//            System.out.println("Равны две части : " + (total - arr5) + " и " + arr5);
//        } else if (arr6 == (total - arr6)) {
//            System.out.println("Равны две части : " + (total - arr6) + " и " + arr6);
//        } else if (arr7 == (total - arr7)) {
//            System.out.println("Равны две части : " + (total - arr7) + " и " + arr7);
//        } else if (arr[7] == (total - arr[7])) {
//            System.out.println("Равны две части : " + (total - arr[7]) + " и " + arr[7]);
//        }

//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == (total - arr[i])) {
//                System.out.println(total / 2);
//            } else {
//                total = total - arr[i];
//
//            }
//        }
//    }
//}

//----------------------------------------------------------------------------------------------------------------------





