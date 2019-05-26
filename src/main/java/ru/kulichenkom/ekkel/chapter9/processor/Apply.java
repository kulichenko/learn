package ru.kulichenkom.ekkel.chapter9.processor;

public class Apply {
    public static void process(Processor processor, Object s) {
        System.out.println("Using processor " + processor.name());
        System.out.println(processor.process(s));
    }
}
