import java.io.FileWriter;
import java.io.IOException;

public class secondSem {
    //     public static void main(String[] args) {
    //     System.out.println(isPalindrom("шалаш"));
    // }
// 1. Создать метод, который проверяет, является ли строка палиндромом.
// Палиндром - шалаш


private static boolean isPalindrom (String value) {
    for (int i = 0; i < value.length()/2; i++) {
    return (value.charAt(i) == value.charAt(value.length()-1-i));
    }
    return false;
}

public static void main(String[] args) {
    try (FileWriter fw = new FileWriter("file.txt", false)) {
        int i = 0;
        while (i<100) {
        fw.write("TEST");
        fw.append("\n");
        fw.flush();
        i++;
        }
    } catch (IOException e) {
        System.out.println("error");
    }
    }


}
