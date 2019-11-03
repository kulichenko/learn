//Ch15Ex20 Создайте интерфейс с двумя методами и класс, который реализует этот интерфейс и
//добавляет еще один метод. В другом классе создайте обобщенный метод с аргументом-типом,
//ограниченным по интерфейсу; Покажите, что методы интерфейса могут вызываться в этом обобщенном методе.
//В main() передайте экземпляр реализующего класса  обобщенному методу
package ru.kulichenkom.ekkel.chapter15;

interface Robot {
    void moveTo();

    void waitFor();
}

class AutomaticGuidedVehicle implements Robot {

    @Override
    public void moveTo() {
        System.out.println("AGV is moving to the next point");
    }

    @Override
    public void waitFor() {
        System.out.println("AGV is waiting for something");
    }

    public void unload() {
        System.out.println("AGV is unloading");
    }
}

public class Ex20 {
    public static <T extends Robot> void executedCommand(T type) {
        type.moveTo();
        type.waitFor();
    }

    public static void main(String[] args) {
        AutomaticGuidedVehicle agv = new AutomaticGuidedVehicle();
        agv.unload();
        Ex20.executedCommand(agv);
    }
}