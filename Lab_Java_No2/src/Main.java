// Завдання 1

//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in); // створюємо сканер
//        System.out.print("Введіть рядок: ");
//        String s = sc.nextLine(); // зчитуємо рядок
//
//        // перетворюємо всі символи у верхній регістр
//        String result = s.toUpperCase();
//
//        // виводимо результат
//        System.out.println("Результат: " + result);
//    }
//}


// Завдання 2


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in); // створюємо сканер
//        System.out.print("Введіть рядок: ");
//        String s = sc.nextLine(); // вводимо рядок
//
//        // замінюємо всі входження "test" на "success"
//        String result = s.replace("test", "success");
//
//        // виводимо результат
//        System.out.println("Результат: " + result);
//    }
//}

// Завдання 3


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введіть рядок: ");
//        String s = sc.nextLine();
//
//        s = s.trim(); // прибираємо пробіли з країв
//
//        int start = 0; // початок слова
//
//        for (int i = 0; i < s.length(); i++) {
//
//            // якщо знайшли пробіл — кінець слова
//            if (s.charAt(i) == ' ') {
//
//                // беремо слово
//                String word = s.substring(start, i);
//
//                // виводимо слово і його довжину
//                System.out.println(word + " (" + word.length() + ")");
//
//                start = i + 1; // нове слово починається після пробілу
//            }
//        }
//
//        // виводимо останнє слово
//        String lastWord = s.substring(start);
//        System.out.println(lastWord + " (" + lastWord.length() + ")");
//    }
//}


// Завдання 4


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введіть рядок: ");
//        String s = sc.nextLine();
//
//        s = s.trim(); // прибираємо зайві пробіли
//
//        int count = 0; // лічильник слів
//
//        // якщо рядок не пустий — є хоча б одне слово
//        if (!s.isEmpty()) {
//            count = 1;
//
//            for (int i = 0; i < s.length(); i++) {
//
//                // якщо знайшли пробіл — нове слово
//                if (s.charAt(i) == ' ') {
//                    count++;
//                }
//            }
//        }
//
//        System.out.println("Кількість слів: " + count);
//    }
//}

// Завдання 5


//import java.util.Scanner;
//
//public class Main {
//
//    // метод перевірки
//    public static boolean isPalindrome(String s) {
//
//        // прибираємо пробіли і робимо всі букви маленькими
//        s = s.replace(" ", "").toLowerCase();
//
//        int left = 0; // початок
//        int right = s.length() - 1; // кінець
//
//        // порівнюємо символи з обох сторін
//        while (left < right) {
//
//            if (s.charAt(left) != s.charAt(right)) {
//                return false; // якщо не рівні — не паліндром
//            }
//
//            left++;  // рухаємося вправо
//            right--; // рухаємося вліво
//        }
//
//        return true; // якщо все співпало
//    }
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Введіть рядок: ");
//        String s = sc.nextLine();
//
//        // викликаємо метод
//        if (isPalindrome(s)) {
//            System.out.println("Це паліндром");
//        } else {
//            System.out.println("Це НЕ паліндром");
//        }
//    }
//}
