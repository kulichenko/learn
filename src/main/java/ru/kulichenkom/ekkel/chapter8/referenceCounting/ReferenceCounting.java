//Пример из книги (стр. 254)
//подсчет ссылок для уничтожения совместно исполльзуемых объектов
package ru.kulichenkom.ekkel.chapter8.referenceCounting;

class Shared {
    private static long counter = 0;
    private final long id = counter++;
    private int refCount = 0;

    public Shared() {
        System.out.println("Создаем " + this);
    }

    public void addRef() {
        refCount++;
    }

    protected void dispose() {
        if (--refCount == 0)
            System.out.println("Уничтожаем " + this);
    }

    public String toString() {
        return "Shared " + id;
    }
}

class Composing {
    private static long counter = 0;
    private final long id = counter++;
    private Shared shared;

    public Composing(Shared shared) {
        System.out.println("Создаем " + this);
        this.shared = shared;
        this.shared.addRef();
    }

    protected void dispose() {
        System.out.println("Уничтожаем " + this);
        shared.dispose();
    }

    public String toString() {
        return "Composing " + id;
    }
}

public class ReferenceCounting {
    public static void main(String[] args) {
        Shared shared = new Shared();
        Composing[] composing = {
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared),
                new Composing(shared)};
        for (Composing c : composing)
            c.dispose();
    }
}
