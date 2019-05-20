package ru.kulichenkom.ekkel.chapter9.processor;

public class StringMixer {
    public static void main(String[] args) {
        StringMixer stringMixer = new StringMixer();
        System.out.println(stringMixer.process("214365"));
    }

    public String process(String getNewString) {
        char[] charSequence = new char[getNewString.length()];
        if (getNewString.length() % 2 == 0) {
            for (int i = 0; i < getNewString.length(); i += 2) {
                charSequence[i] = getNewString.charAt(i + 1);
                charSequence[i + 1] = getNewString.charAt(i);
            }
            return new String(charSequence);
        } else {
            for (int i = 0; i < getNewString.length() - 1; i += 2) {
                charSequence[i] = getNewString.charAt(i + 1);
                charSequence[i + 1] = getNewString.charAt(i);
            }
            charSequence[getNewString.length() - 1] = getNewString.charAt(getNewString.length() - 1);
        }
        return new String(charSequence);
    }
}
