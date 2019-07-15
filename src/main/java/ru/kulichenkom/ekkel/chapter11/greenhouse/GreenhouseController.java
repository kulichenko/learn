//Ch11Ex13 В примере GreenhouseController.java класс Controller использует ArrayList.
//Измените код так, чтобы в нем использовался класс LinkedList, и организуйте перебор множества
//событий с использованием Iterator.
// классы примера: GreenhouseController.java,GreenhouseControls.java,
// controller/Controller.java,controller/Event.java

package ru.kulichenkom.ekkel.chapter11.greenhouse;

import ru.kulichenkom.ekkel.chapter11.greenhouse.controller.*;

public class GreenhouseController {
    public static void main(String[] args) {
        GreenhouseControls greencontrols = new GreenhouseControls();
        // Instead of hard-wiring, you could parse
        // configuration information from a text file here:
        greencontrols.addEvent(greencontrols.new Bell(900));
        Event[] eventList = {
                greencontrols.new ThermostatNight(0),
                greencontrols.new LightOn(200),
                greencontrols.new LightOff(400),
                greencontrols.new WaterOn(600),
                greencontrols.new WaterOff(800),
                greencontrols.new ThermostatDay(1400)
        };
        greencontrols.addEvent(greencontrols.new Restart(2000, eventList));
        if (args.length == 1) {
            greencontrols.addEvent(
                    new GreenhouseControls.Terminate(
                            Integer.valueOf(args[0])));
        }
        greencontrols.run();
    }
}