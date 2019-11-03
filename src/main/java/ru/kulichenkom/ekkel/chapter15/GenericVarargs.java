package ru.kulichenkom.ekkel.chapter15;
//Обобщенные методы сосуществуют со списками аргументов переменной длинны:
//: generics/GenericVarargs.java

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
  public static <T> List<T> makeList(T... args) {
    List<T> result = new ArrayList<>();
    for(T item : args)
      result.add(item);
    return result;
  }

  public static void main(String[] args) {
    List<String> ls = makeList("A");
    System.out.println(ls);
    ls = makeList("A", "B", "C");
    System.out.println(ls);
    ls = makeList("ABCDEFFHIJKLMNOPQRSTUVWXYZ".split(""));
    System.out.println(ls);
  }
}
//метод makeList реализует ту же функциональность,что и метод java.util.Arrays.asList() стандартной библиотеки.