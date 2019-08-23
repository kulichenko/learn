//Ch12Ex21 Продемонстрируйте, что конструктор производного класса не может перехватывать
//исключения возбужденные конструктором базового класса
package ru.kulichenkom.ekkel.chapter12;

class Building {
    public Building() throws MyFirstException {
        throw new MyFirstException("Исключение возбуждено в конструкторе базового классак Building");
    }
}

class Home extends Building {
    public Home() throws MyFirstException {
        super();
//        try{
//            super();
//        }catch (MyFirstException e){
//
//        } поймать exception в конструкторе производного класс через try-catch не получается
    }
}

public class Exercise21 {
    public static void main(String[] args) {
        {
            try {
                Home myHome = new Home();
            } catch (MyFirstException e) {
                e.printStackTrace();
            }
        }
    }
}