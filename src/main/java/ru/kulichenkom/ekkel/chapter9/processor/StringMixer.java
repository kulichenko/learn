package ru.kulichenkom.ekkel.chapter9.processor;

public class StringMixer {
    public static void main(String[] args) {
        StringMixer stringMixer = new StringMixer();
        System.out.println(stringMixer.process("2143659"));
    }

    public String process(String getNewString) {
        char[] charSequence = new char[getNewString.length()]; // создаем массив символов равный длине строки
        if (getNewString.length() % 2 == 0) { //проверяем чет/нечет количество символов в строке
            for (int i = 0; i < getNewString.length(); i += 2) { //цикл для проверки каждой пары символов
                charSequence[i] = getNewString.charAt(i + 1); //меняем местами (через присвоение) каждую пару символов
                charSequence[i + 1] = getNewString.charAt(i); //меняем местами (через присвоение) каждую пару символов
            }
            return new String(charSequence); // возвращаем полученную строку
        } else {
            for (int i = 0; i < getNewString.length() - 1; i += 2) {//Цикл перебирает символы, если в строке нечет количество символов
                charSequence[i] = getNewString.charAt(i + 1);//меняем местами (через присвоение) каждую пару символов
                charSequence[i + 1] = getNewString.charAt(i);//меняем местами (через присвоение) каждую пару символов
            }
            charSequence[getNewString.length() - 1] = getNewString.charAt(getNewString.length() - 1); //последний символ строки остается последним, так как его не с чем менять
        }
        return new String(charSequence);// возвращаем полученную строку
    }
}
