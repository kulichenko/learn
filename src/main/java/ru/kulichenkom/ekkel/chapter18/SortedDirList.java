//Ch18Ex2 Создайте класс с именем SortedDirList, конструктор которого принимает информацию о пути к файлу
// и на основе этой информации составляет отсортированный список файлов в указанном катилоге. Создайте два
//перегруженных метода list(), один должен возвращать весь список файлов, другой подмножество списка, соответствующее
//аргументу (regex)
package ru.kulichenkom.ekkel.chapter18;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class SortedDirList {
    String[] list;

    public SortedDirList(File path) {
        list = path.list();
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
    }

    public static void main(String[] args) {
        SortedDirList sortedDirList = new SortedDirList(new File("D://"));
        System.out.println(sortedDirList);
        for (String s : sortedDirList.list()) {
            System.out.println(s);
        }
        System.out.println();
        for (String s : sortedDirList.list("S.+l")) {
            System.out.println(s);
        }
    }

    public String[] list() {
        return list;
    }

    public String[] list(String regex) {
        Pattern pattern = Pattern.compile(regex);
        List<File> fileArrayList = new ArrayList<>();
        int counter = 0;
        for (File file : fileArrayList) {
            if (pattern.matcher(file.getName()).matches()) {
                counter++;
                fileArrayList.add(file);
            }
        }
        return fileArrayList.toArray(new String[counter]);
    }
}
