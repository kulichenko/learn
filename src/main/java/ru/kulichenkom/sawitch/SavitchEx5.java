//Программа должна прочесть строку текста, после чего выводит ее,
// переместив первое слово в конец строки.
package ru.kulichenkom.sawitch;
import java.util.Scanner;

public class SavitchEx5 {
    public static void main(String[] args) {

        System.out.println("Enter a phrase without punctuation:");
        Scanner in = new Scanner(System.in);
        String words = in.nextLine();
        in.close();
        int gapFirst, gapLast;
        gapFirst = words.indexOf(" ");
        gapLast = words.lastIndexOf(" ");
        String words1 = words.substring(0, gapFirst);
        String words2 = words.substring(gapLast);
        String words3 = words.substring(gapFirst, gapLast);
        //System.out.println(words+ " " + words1 + " " + words2+ " " +gap_1 + " " + gap_2);
        System.out.println("Yor phrase: " + words2 +  words3 + " " + words1);
    }

}
