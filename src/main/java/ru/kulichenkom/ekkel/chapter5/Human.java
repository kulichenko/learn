//Ch5Ex8 Create a class with two methods. Within the first method, call the second method twice:
// the first time without using this, and the second time using this—just to see it working;
// you should not use this form in practice.
package ru.kulichenkom.ekkel.chapter5;

public class Human {
    private String name;
    private int weight;

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Frokl");
        human.setWeight(70);
        human.fullDescription();
    }

    void parameter() {
        System.out.print(weight);
    }

    void fullDescription() {
        parameter();//вложенный метод
        System.out.print(" кг весит мистер " + name + "\n");
        System.out.println("Вы слышите? ");
        this.parameter(); //проверка работы со словом this
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
