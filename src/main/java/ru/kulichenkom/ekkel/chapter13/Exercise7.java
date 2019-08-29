//Ch13Ex7 Взяв за основу документацию java.util.regex.Pattern, напишите
//и протестируйте регулярное выражение, которое проверяет, что предложение
// начинается с прописной буквы и завершается точкой.
package ru.kulichenkom.ekkel.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise7 {

    public static void main(String[] args) {
        Exercise7 exercise7 = new Exercise7();
        exercise7.checkText("Test my exercise.");
    }

    public boolean checkText(String text) {
        Pattern pattern = Pattern.compile("^[A-Z].*[.]$");
        Matcher matcher = pattern.matcher(text);
        System.out.println(matcher.matches());
        return matcher.matches();
    }
}