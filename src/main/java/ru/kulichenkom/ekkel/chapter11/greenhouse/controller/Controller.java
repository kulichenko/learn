//Ch11Ex13 В примере GreenhouseController.java класс Controller использует ArrayList.
//Измените код так, чтобы в нем использовался класс LinkedList, и организуйте перебор множества
//событий с использованием Iterator.
// классы примера: GreenhouseController.java,GreenhouseControls.java,
// controller/Controller.java,controller/Event.java
package ru.kulichenkom.ekkel.chapter11.greenhouse.controller;

//: innerclasses/controller/Controller.java
// The reusable framework for control systems.

import java.util.*;

public class Controller {
    // A class from java.util to hold Event objects:
    private List<Event> eventList = new LinkedList<>();

    public void addEvent(Event event) {
        eventList.add(event);
    }

    public void run() {
        Iterator<Event> controllerIterator = eventList.iterator();
        while (controllerIterator.hasNext()) {
            System.out.println(controllerIterator.next());
            eventList.remove(eventList);
        }
    }
}