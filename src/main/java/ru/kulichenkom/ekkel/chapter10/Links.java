//Ch10Ex19 Создайте интерфейс с вложенным классом, содержащим статический метод
//который вызывает методы вашего интерфейса и выводит результаты.
//Реализуйте интерфейс и передайте экземпляр своей реализации методу.
package ru.kulichenkom.ekkel.chapter10;

public interface Links {
    void goTo();

    void copyLink();

    void shareLink();

    class UseLinks {
        static void usingLinks(Links links) {
            links.goTo();
            links.copyLink();
            links.shareLink();
        }
    }
}

class Link1 implements Links {

    public static void main(String[] args) {
        Links link1 = new Link1();
        Links.UseLinks.usingLinks(link1);
    }

    @Override
    public void goTo() {
        System.out.println("go to link one");
    }

    @Override
    public void copyLink() {
        System.out.println("copy link one");
    }

    @Override
    public void shareLink() {
        System.out.println("share link one");
    }
}
