//Ch12Ex1 Создайте класс с методом main(), возбуждающим искл типа Exception из блока try.
//Задайте в конструкторе для Exception строковый аргумент. Перехватите исключение в блоке catch
// и распечатайте текст аргумента. Добавьте блок finally и выведите сообщение, как доказательство,
//его выполнения
package ru.kulichenkom.ekkel.chapter12;

public class Exercise1 {
    public static void getException(String description) throws Exception {
        throw new Exception(description);
    }

    public static void main(String[] args) {
        try {
            getException("Вызываем метод выбрасывающий исключение");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Перехвачено исключение");
        } finally {
            System.out.println("Блок finally работает");
        }
    }
}