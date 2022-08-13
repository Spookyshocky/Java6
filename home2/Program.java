package home2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program {
    // 1 Напишите программу на Java, чтобы найти наименьшее окно в строке,
    // содержащей все символы другой строки
    public static void minWindow(String firstText, String secondText) {
        Pattern pattern = Pattern.compile(secondText); 
        Matcher matcher = pattern.matcher(firstText); 
        while (matcher.find()) {
            System.out.println(firstText.substring(matcher.start(), matcher.end()));
        }
    //через реулярные выражения находим все полные совпадения текста второй строки с первой
    //после семинара появилось впечатление что все окна одинаковые, а значит наименьшие 
    }

    public static void main(String[] args) {
        // minWindow("hello world - hell words", "hell");
        minWindow("hello world - hell words - help", "hell");
    }

    // 2 Напишите программу на Java, чтобы проверить, являются ли две данные строки
    // вращением друг друга.
    // 3 *Напишите программу на Java, чтобы перевернуть строку с помощью рекурсии.
    // 4 Дано два числа, например 3 и 56, необходимо составить следующие строки:
    // 3 + 56 = 59
    // 3 – 56 = -53
    // 3 * 56 = 168
    // Используем метод StringBuilder.append().
    // 5 Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.insert(),
    // StringBuilder.deleteCharAt().
    // 6 *Замените символ “=” на слово “равно”. Используйте методы
    // StringBuilder.replace().
    // 7 **Сравнить время выполнения пункта 6 со строкой содержащей 10000 символов
    // "="
    // средствами String и StringBuilder.
}
