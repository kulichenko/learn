//Ch9Ex11 (4) Создайте класс с методом, который получает аргумент String
// и переставляет местами каждую пару символов в полученной строке.
// Адаптируйте класс так, чтобы он работал с interfaceprocessor.Apply.process().
package ru.kulichenkom.ekkel.chapter9.processor;

class StringMixerAdapter implements Processor {
    StringMixer stringMixer;

    public StringMixerAdapter(StringMixer stringMixer) {
        this.stringMixer = stringMixer;
    }

    @Override
    public String name() {
        return "StringMixerAdapter";
    }

    @Override
    public Object process(Object input) {
        return stringMixer.process((String) input);
    }
}

public class StringMixerProcessor {
    public static void main(String[] args) {
        String s = "etts  214365";
        Apply.process(new StringMixerAdapter(new StringMixer()), s);
    }
}
