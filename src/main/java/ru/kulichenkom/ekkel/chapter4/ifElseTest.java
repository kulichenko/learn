//Ch4Ex6  Измените метод test() так, чтобы он получал два дополнительных аргумента
//begin и end, а значение testval проверялось на принадлежность к диапазону [begin, end]
package ru.kulichenkom.ekkel.chapter4;

public class ifElseTest {
    static int test(int testval, int begin, int end) {
        if ((testval > begin && (testval < end)))
            return +1;
        else if ((testval < begin) || (testval > end))
            return -1;
        else
            return 0; // Match
    }

    public static void main(String[] args) {
        System.out.println(test(10, 5, 12));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 5));
    }
}

