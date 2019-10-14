//Ch14Ex20 Напишите программу, которая получает имя класса в параметре командной строки
//а затем использует методы класса Class для вывода всей доступной информации о классе.
//{Args: ru.kulichenkom.ekkel.chapter14.RegisteredFactories}
package ru.kulichenkom.ekkel.chapter14;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class ClassInfo {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("You have to enter class name to args");
        }
        Class<?> examinedClass = null;
        try {

            examinedClass = Class.forName(args[0]);
        } catch (ClassNotFoundException e) {
            System.out.println("No such class: " + e);
        }
        System.out.println("examinedClass: " + examinedClass);
        System.out.println("examinedClass.getCanonicalName(): " + examinedClass.getCanonicalName());
        System.out.println("examinedClass.getSimpleName(): " + examinedClass.getSimpleName());
        System.out.println("examinedClass.getClassLoader(): " + examinedClass.getClassLoader());
        System.out.println("examinedClass.getSuperclass(): " + examinedClass.getSuperclass());
        System.out.println("examinedClass.getTypeParameters(): " + examinedClass.getTypeParameters());
        System.out.println("examinedClass.isAnnotation(): " + examinedClass.isAnnotation());
        System.out.println("examinedClass.isAnnotationPresent(Documented.class): " + examinedClass.isAnnotationPresent(Documented.class));
        System.out.println("examinedClass.isAnonymousClass(): " + examinedClass.isAnonymousClass());
        System.out.println("examinedClass.isArray(): " + examinedClass.isArray());
        System.out.println("examinedClass.isAssignableFrom(ClassInfo.class): " + examinedClass.isAssignableFrom(ClassInfo.class));
        System.out.println("examinedClass.isAssignableFrom(Object.class): " + examinedClass.isAssignableFrom(Object.class));
        System.out.println("examinedClass.isEnum(): " + examinedClass.isEnum());
        System.out.println("examinedClass.isInstance(Object.class): " + examinedClass.isInstance(Object.class));
        System.out.println("examinedClass.isInterface(): " + examinedClass.isInterface());
        System.out.println("examinedClass.isLocalClass(): " + examinedClass.isLocalClass());
        System.out.println("examinedClass.isMemberClass(): " + examinedClass.isMemberClass());
        System.out.println("examinedClass.isPrimitive(): " + examinedClass.isPrimitive());
        System.out.println("examinedClass.isSynthetic(): " + examinedClass.isSynthetic());
        System.out.println("examinedClass.getDeclaringClass(): " + examinedClass.getDeclaringClass());
        System.out.println("examinedClass.getEnclosingConstructor(): " + examinedClass.getEnclosingConstructor());
        System.out.println("examinedClass.getEnclosingMethod(): " + examinedClass.getEnclosingMethod());
        System.out.println("examinedClass.getEnumConstants(): " + examinedClass.getEnumConstants());
        System.out.println("examinedClass.getGenericSuperclass(): " + examinedClass.getGenericSuperclass());
        System.out.println("examinedClass.getModifiers(): " + examinedClass.getModifiers());
        System.out.println("examinedClass.getName(): " + examinedClass.getName());
        System.out.println("examinedClass.getPackage(): " + examinedClass.getPackage());
        System.out.println("examinedClass.getProtectionDomain(): " + examinedClass.getProtectionDomain());
        System.out.println("examinedClass.getAnnotations(): ");
        if (examinedClass.getAnnotations().length == 0) {
            System.out.println("No annotations");
        }
        for (Annotation a : examinedClass.getAnnotations()) {
            System.out.println(a);
        }
        System.out.println("examinedClass.getDeclaredAnnotations(): ");
        if (examinedClass.getDeclaredAnnotations().length == 0) {
            System.out.println("No Declared annotations");
        }
        for (Annotation a : examinedClass.getDeclaredAnnotations()) {
            System.out.println(a);
        }
        System.out.println("examinedClass.getClasses(): ");
        if (examinedClass.getClasses().length == 0) {
            System.out.println("No Classes");
        }
        for (Class cl : examinedClass.getClasses()) {
            System.out.println(cl);
        }
        System.out.println("examinedClass.getDeclaredClasses(): ");
        if (examinedClass.getDeclaredClasses().length == 0) {
            System.out.println("No Classes");
        }
        for (Class cl : examinedClass.getDeclaredClasses()) {
            System.out.println(cl);
        }
        System.out.println("examinedClass.getFields(): ");
        if (examinedClass.getFields().length == 0) {
            System.out.println("No fields");
        }
        for (Field f : examinedClass.getFields()) {
            System.out.println(f);
        }
        System.out.println("examinedClass.getDeclaredFields(): ");
        if (examinedClass.getDeclaredFields().length == 0) {
            System.out.println("No fields");
        }
        for (Field f : examinedClass.getDeclaredFields()) {
            System.out.println(f);
        }
        System.out.println("examinedClass.getConstructors(): ");
        if (examinedClass.getConstructors().length == 0) {
            System.out.println("No constr");
        }
        for (Constructor c : examinedClass.getConstructors()) {
            System.out.println(c);
        }
        System.out.println("examinedClass.getDeclaredConstructors(): ");
        if (examinedClass.getDeclaredConstructors().length == 0) {
            System.out.println("No constr");
        }
        for (Constructor c : examinedClass.getDeclaredConstructors()) {
            System.out.println(c);
        }
        System.out.println("examinedClass.getMethods(): ");
        if (examinedClass.getMethods().length == 0) {
            System.out.println("No Method");
        }
        for (Method m : examinedClass.getMethods()) {
            System.out.println(m);
        }
        System.out.println("examinedClass.getDeclaredMethods(): ");
        if (examinedClass.getDeclaredMethods().length == 0) {
            System.out.println("No Method");
        }
        for (Method m : examinedClass.getDeclaredMethods()) {
            System.out.println(m);
        }
        System.out.println("examinedClass.getDeclaredFields(): ");
        if (examinedClass.getFields().length == 0) System.out.println("none");
        for (Field f : examinedClass.getFields()) {
            System.out.println(f);
        }
        System.out.println("examinedClass.getGenericInterfaces(): ");
        if (examinedClass.getGenericInterfaces().length == 0) {
            System.out.println("none");
        }
        for (Type t : examinedClass.getGenericInterfaces()) {
            System.out.println(t);
        }
        System.out.println("examinedClass.getInterfaces(): ");
        if (examinedClass.getInterfaces().length == 0) {
            System.out.println("none");
        }
        for (Class i : examinedClass.getInterfaces()) {
            System.out.println(i);
        }
        System.out.print("examinedClass.getSigners(): ");
        if (examinedClass.getSigners() == null) {
            System.out.println(examinedClass.getSigners());
        }
        if (examinedClass.getSigners() != null) {
            System.out.println();
            if (examinedClass.getSigners().length == 0) {
                System.out.println("none");
            }
            if (examinedClass.getSigners().length > 0) {
                for (Object s : examinedClass.getSigners()) {
                    System.out.println(s);
                }
            }
        }
    }
}