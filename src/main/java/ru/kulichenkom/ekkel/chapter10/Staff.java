//Ch10Ex10 Повторите предыдущее упражнение (9-е, закомментировано ниже),
//но определите внутренний класс в области действия внутри метода.
package ru.kulichenkom.ekkel.chapter10;

interface ToDoWork {
    void task();
}

public class Staff {
    private String unit1 = "Tom Soyer";

    public static void main(String[] args) {
        Staff tomSoyer = new Staff();
        tomSoyer.doWork(true).task();
    }

    public ToDoWork doWork(boolean availabilityOfPaint) {
        if (availabilityOfPaint) {
            class PaintFence implements ToDoWork {
                @Override
                public void task() {
                    System.out.println(unit1 + " is painting the fence.");
                }
            }
            return new PaintFence();
        }
        return null;
    }
}

//Ch10Ex9 создайте интерфейс, содержащий минимум один метод.
//Реализуйте его, определяя внутренний класс в методе, который возвращает
//ссылку на ваш интерфейс.
//package ru.kulichenkom.ekkel.chapter10;
//
//interface ToDoWork {
//    void task();
//}
//
//public class Staff {
//    private String unit1 = "Tom Soyer";
//
//    public static void main(String[] args) {
//        Staff tomSoyer = new Staff();
//        tomSoyer.doWork().task();
//    }
//
//    public ToDoWork doWork() {
//        class PaintFence implements ToDoWork {
//            @Override
//            public void task() {
//                System.out.println(unit1 + " is painting the fence.");
//            }
//        }
//        return new PaintFence();
//    }
//}
