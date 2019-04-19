//Ch5Ex9 Подготовьте класс с двумя перегруженными конструкторами.
//Используя ключевое слово this вызовите второй конструктор из первого
package ru.kulichenkom.ekkel.chapter5;

public class Library {
    String nameOfBook;
    int quantityOfShits;

    public Library(int quantityOfShits, String nameOfBook) {
        this(quantityOfShits);
        this.nameOfBook = nameOfBook;
    }

    public Library(int quantityOfShits) {
        this.quantityOfShits = quantityOfShits;
    }

    public static void main(String[] args) {
        Library whichBook = new Library(100, "Книга для детей");
        System.out.println(whichBook.getNameOfBook() + " содержит " + whichBook.getQuantityOfShits() + " страниц");
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public int getQuantityOfShits() {
        return quantityOfShits;
    }
}


