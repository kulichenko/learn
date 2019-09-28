//Ch14Ex17
package ru.kulichenkom.ekkel.chapter14;
//: typeinfo/ShowMethods.java
// Using reflection to show all the methods of a class,
// even if the methods are defined in the base class.
// {Args: ShowMethods}

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;


public class ShowMethods {
    private static Pattern p = Pattern.compile("(\\w+\\.)|\\s*final|\\s*native");

    public static void main(String[] args) {
        int lines = 0;
        Class<?> c = RegisteredFactories.class;
        Method[] methods = c.getMethods();
        Constructor[] ctors = c.getConstructors();
        for (Method method : methods) {
            System.out.println(p.matcher(method.toString()).replaceAll(""));
        }
        for (Constructor ctor : ctors) {
            System.out.println(p.matcher(ctor.toString()).replaceAll(""));
        }
        lines = methods.length + ctors.length;
    }
}