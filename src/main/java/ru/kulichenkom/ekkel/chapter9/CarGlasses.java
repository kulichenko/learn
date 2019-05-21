package ru.kulichenkom.ekkel.chapter9;
//Ch9Ex13 Сздайте интерфейс и определите 2 новых интерфейса, производных от него.
//Выполните множественное наследование третьего интерфейса от первых двух.

interface SideGlasses {
    void openSideGlass();

    void closeSideGlass();
}

interface RearSideGlass extends SideGlasses {
    void openRearRhSideGlass();

    void openRearLhSideGlass();

    void closeRearRhSideGlass();

    void closeRearLhSideGlass();
}

interface FrontSideGlass extends SideGlasses {
    void openFrontRhSideGlass();

    void openFrontLhSideGlass();

    void closeFrontRhSideGlass();

    void closeFrontLhSideGlass();
}

interface CarGlass extends RearSideGlass, FrontSideGlass {
}

public class CarGlasses implements CarGlass {

    @Override
    public void openSideGlass() {
        System.out.println("Открыть окна");
        openFrontLhSideGlass();
        openFrontRhSideGlass();
        openRearLhSideGlass();
        openRearRhSideGlass();
    }

    @Override
    public void closeSideGlass() {
        System.out.println("Закрыть окна");
        closeFrontLhSideGlass();
        closeFrontRhSideGlass();
        closeRearLhSideGlass();
        closeRearRhSideGlass();
    }

    @Override
    public void openRearRhSideGlass() {
        System.out.println("Открыть заднее правое окно");
    }

    @Override
    public void openRearLhSideGlass() {
        System.out.println("Открыть заднее левое окно");
    }

    @Override
    public void closeRearRhSideGlass() {
        System.out.println("Закрыть заднее правое окно");
    }

    @Override
    public void closeRearLhSideGlass() {
        System.out.println("Закрыть заднее левое окно");
    }

    @Override
    public void openFrontRhSideGlass() {
        System.out.println("Открыть переднее правое окно");
    }

    @Override
    public void openFrontLhSideGlass() {
        System.out.println("Открыть переднее левое окно");
    }

    @Override
    public void closeFrontRhSideGlass() {
        System.out.println("Закрыть переднее правое окно");
    }

    @Override
    public void closeFrontLhSideGlass() {
        System.out.println("Закрыть переднее левое окно");
    }

    public static void main(String[] args) {
        CarGlass carGlass = new CarGlasses();
        carGlass.openSideGlass();
        carGlass.closeSideGlass();
    }
}

