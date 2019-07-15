//Ch11Ex17 Возьмите класс Gerbil из упр 1 и поместите его в контейнер Map.
//Используйте объект String, содержащий имя каждого объекта Gerbil,
//в качестве ключа для связывания с объектом Gerbil (value), помещаемым в таблицу.
//Получите Iterator для keySet() и используйте его для перемещения по Map,
//с выборкой объекта Gerbil для каждого ключа, выводом ключа и вызовом метода hop().
package ru.kulichenkom.ekkel.chapter11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exercise17 {
    public static void main(String[] args) {
        Map<String, Gerbil> gerbilMap = new HashMap<>();
        gerbilMap.put("Klava", new Gerbil(0));
        gerbilMap.put("Silva", new Gerbil(1));
        gerbilMap.put("Pidgin", new Gerbil(2));
        gerbilMap.put("Kopete", new Gerbil(3));
        gerbilMap.put("Lusya", new Gerbil(4));
        gerbilMap.put("Zina", new Gerbil(5));
        Iterator<String> iterator = gerbilMap.keySet().iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            System.out.print(s + ": ");
            gerbilMap.get(s).hop();
        }
    }
}
