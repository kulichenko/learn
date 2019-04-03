//Упражнение 6 главы 2.  Напишите программу, включающую метод storage(), приведенный ранее в этой главе
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
    /*определение класса*/
    //возвращаемыйТип ИмяМетода(список аргументов){тело метода}

    public int storage(String w) {
        return w.length() * 2;
    }

    public double naturalLogBase() {
        return 2.718;
    }

    public static void main(String[] args) {
        StorageCh2Ex6 example = new StorageCh2Ex6();
        System.out.println(example.storage("trakataka"));
        System.out.println(example.naturalLogBase());

    }
}
