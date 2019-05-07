package ru.kulichenkom.ekkel.chapter8.human;

class Human {
    private String name, sortOfActivity;
    private int age;

    public String getSortOfActivity() {
        return sortOfActivity;
    }

    public void setSortOfActivity(String sortOfActivity) {
        this.sortOfActivity = sortOfActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void live() {
        System.out.println(getName() + " " + getAge() + " лет");
        doing();
    }

    public void doing() {
        System.out.println(getName() + " " + getSortOfActivity());
    }
}
