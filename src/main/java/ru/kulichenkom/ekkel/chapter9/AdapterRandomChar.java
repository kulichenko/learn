//Ch9Ex16 Создайте класс, который генерирует серию char. Адаптируйте его так,
//чтобы он мог использоваться для передачи данных Scanner.
package ru.kulichenkom.ekkel.chapter9;

import java.nio.CharBuffer;
import java.util.Scanner;

public class AdapterRandomChar extends RandomChars implements Readable {
    private int count;

    public AdapterRandomChar(int count) {
        this.count = count;
    }

    public static void main(String[] args) {
        Scanner symbols = new Scanner(new AdapterRandomChar(10));
        while (symbols.hasNext())
            System.out.print(symbols.next() + " ");
    }

    @Override
    public int read(CharBuffer charBuffer) {
        if (count-- == 0) {
            return -1;
        }
        String result = next() + " ";
        charBuffer.append(result);
        return result.length();  //количество присоединенных символов
    }
}
