//Ch5Ex19 Напищите метод, получающий список аргументов переменной длины с массивом String.
//Убедитесь в том, что методу может передаваться как список объектов String, разделенных запятыми,
// так и String[].
package ru.kulichenkom.ekkel.chapter5;

public class VarArray {

    private void street(String... streets) {
        for (String s : streets)
            System.out.print(s);
    }

    public static void main(String[] args) {
        VarArray varArray = new VarArray();
        varArray.street("Клубная, ", "Школьная, ", "Караминская,");
        varArray.street(" Клубная 11, ", "Школьная 15, ", "Караминская 19");
    }
}
