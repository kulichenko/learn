//Ch5Ex6 Измените предыдущее упражнение так, чтобы два перегруженных метода
//принимали два аргумента разных типов и отличались только порядком их следования в списке аргументов.

package ru.kulichenkom.ekkel.chapter5;

public class DogChange {
    private void bark(char whining, byte squeal) {
        System.out.println("Это перегруженный метод char " + whining);
        System.out.println("Это перегруженный метод byte " + squeal);
    }

    private void bark(byte squeal, char whining) {
        System.out.println("Это перегруженный метод byte " + squeal);
        System.out.println("Это перегруженный метод char " + whining);
    }

    public static void main(String[] args) {
        DogChange dog = new DogChange();
        dog.bark((byte) 2, 'd');
        dog.bark('d', (byte) 2);
    }
}

