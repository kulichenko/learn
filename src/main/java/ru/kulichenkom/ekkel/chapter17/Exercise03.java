//Ch17Ex03
//Используя данные Countries несколько раз заполните контейнер Set одними данными и убедитесь, что в Set в конечном итоге
//каждый экземпляр входит в множество однократно.
//попробуйте HashSet, LinkedHashSet, TreeSet.
package ru.kulichenkom.ekkel.chapter17;

import ru.kulichenkom.utils.Countries;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

public class Exercise03 {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Pattern pattern = Pattern.compile("R[a-zA-Z]*");
        for (int i = 0; i < Countries.DATA.length; i++) {
            if (pattern.matcher(Countries.DATA[i][0]).matches()) {
                for (int j = 0; j < 3; j++) {
                    hashSet.add(Countries.DATA[i][0]);
                    linkedHashSet.add(Countries.DATA[i][0]);
                    treeSet.add(Countries.DATA[i][0]);
                }
            }
        }
        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
    }
}