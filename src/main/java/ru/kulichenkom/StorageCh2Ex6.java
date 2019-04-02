//Упражнение 6 главы 2.  Write a program that includes and calls the storage( ) method defined
//as a code fragment in this chapter.
// То, что нашел в учебнике:
//int storage(String s) {
// return s.length() * 2;
//}
// boolean flag() { return true; }
//double naturalLogBase() { return 2.718; }
//void nothing() { return; }
//void nothing2() {}

package ru.kulichenkom;

public class StorageCh2Ex6 {
    private int storage(String s) {
        return s.length() * 2;
    }

    public static void main(String[] args) {
        StorageCh2Ex6 s = new StorageCh2Ex6();
        System.out.println(s);
    }

}
