/*Ch11Ex27 Напишите класс с именем Command, который содержит поле String и метод operation(),
выводящий String. Напишите второй класс с методом, который заполняет контейнер объектами
Command и выводит его. Передайте заполненный контейнер Queue методу третьего класса,
перебирающему объекты Queue и вызывающему их методы operation()*/
package ru.kulichenkom.ekkel.chapter11;

import java.util.LinkedList;
import java.util.Queue;

class Command {
    private String name;

    public Command(String name) {
        this.name = name;
    }

    public void operation() {
        System.out.println(name);
    }
}

class FillQueue {

    public Queue<Command> fillingQueue() {
        Queue<Command> commands = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            commands.offer(new Command(String.valueOf(i)));
        }
        return commands;
    }
}

public class CommandEx27 {
    public static void pollElement(Queue<Command> command) {
        while (command.peek() != null) {
            command.poll().operation();
        }
    }

    public static void main(String[] args) {
        FillQueue fill = new FillQueue();
        pollElement(fill.fillingQueue());

    }
}