import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;

public class project {
    //сумма двух чисел больше 10 и меньше 20
    // static boolean isSumBetween10And20 (int a, int b) 
    //     {
    //     if (a + b >= 10 && a + b <=20) {
    //                 return true;
    //         }
    //             else {
    //                 return false;
    //     }
    // }
    //public static void main(String[] args) {
    // System.out.println(isSumBetween10And20(5, 15)); // true
    // System.out.println(isSumBetween10And20(7, 15)); // false
    //}
    
    //проверить, положительное ли число, 0 тоже положительный
    // private static boolean isPositive(int x) {
    //     return (x>=0);
    // }

    // public static void main(String[] args) {
    // System.out.println(isPositive(0));
    // }

    // повторить строку n раз
//     private static String printString(String source, int repeat) {
//         String result = "";
//     for( int u = 0; u < repeat; u++ ) {
//         result = result + source;
//     }
//     return result;
// }

//     public static void main(String[] args) {
//         System.out.println(printString("abc", 5));
//     }

// является ли год високосным
//     static void isYear366(int year) {
//         if(year%4==0 && year%100 !=0 || year%400==0) {
//             System.out.println("високосный");
//         }
//         else System.out.println("в году 365 дней");
            
//     }
//     public static void main(String[] args) {
//     isYear366(2023); 
//     }

// создать массив длинной len, заполнить значениями int initalValue
    // private static int[] createArray(int len, int initalValue) {
    //     int [] arr = new int[len];
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = initalValue;
    //     }
    //     return arr;
    // }

    // public static void main(String[] args) {
    //     System.out.println(Arrays.toString(createArray(5, 10)));
    //         }

//     1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

    // private static int[] createArray(int len) {
    //     Random r = new Random();
    //     r.nextInt(2);
    //     int [] arr = new int[len];
    //     for (int i = 0; i < arr.length; i++) {
    //         arr[i] = r.nextInt(2);
    //     }
    //     return arr;
    // }

    // private static int[] sortArray(int [] arr) {
    //     for (int i = 0; i < arr.length; i++) {
    //        if (arr[i] == 0) {
    //         arr[i] = 1;
    //        }
    //        else {
    //         arr[i] = 0;
    //        }
    //     }
    //     return arr;
    // }

    // public static void main(String[] args) {
    // int [] arr = createArray(5);
    // System.out.println(Arrays.toString(arr));
    // System.out.println(Arrays.toString(sortArray(arr)));
    //         }

    //* 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;

//     private static int[] sortArray(int [] arr) {
//         for (int i = 0; i < arr.length; i++) {
//            if (arr[i] < 6) {
//             arr[i] *= 2;
//            }
//     }
//         return arr;
// }

//     public static void main(String[] args) {
//     int[] arr = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//     System.out.println(Arrays.toString(sortArray(arr)));
//     }

// * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). 
// * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];

    // private static int[][] sortArray(int [][] arr) {
    //         for (int i = 0; i < arr.length; i++) {
    //             for (int j = 0; j < arr.length; j++) {
    //                 if (i == j) {
    //                     arr[i][j] = 1;
    //             }
    //             }
    //         }
    //         return arr;
    //     }

    //     public static void main(String[] args) {
    // int[][] arr = new int [4][4] ;
    // System.out.println(Arrays.deepToString(sortArray(arr)));
    // }

    //4. Задать одномерный массив и найти в нем минимальный и максимальный элементы 

    public static void main(String[] args) {
    int[] arr = new int [] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    OptionalInt max = Arrays.stream(arr).max();
    System.out.println("Максимальное число: " + max.getAsInt());
    OptionalInt min = Arrays.stream(arr).min();
    System.out.println("Минимальное число: " + min.getAsInt());
    }
}

