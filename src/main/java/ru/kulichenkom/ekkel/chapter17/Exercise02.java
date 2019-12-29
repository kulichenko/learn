//CH17Ex02 создайте контейнеры Map и Set со всеми странами, названия которых начинаются с буквы "A"
package ru.kulichenkom.ekkel.chapter17;

import ru.kulichenkom.utils.Countries;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

public class Exercise02 {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        Set<String> hashSet = hashMap.keySet();
        Pattern pattern = Pattern.compile("A[a-zA-Z]*");
        for (int i = 0; i < Countries.DATA.length; i++) {
            if (pattern.matcher(Countries.DATA[i][0]).matches()) {
                hashMap.put(Countries.DATA[i][0], Countries.DATA[i][1]);
            }
        }
        System.out.println(hashMap);
        System.out.println(hashSet);
    }
}