//Exercise 10: (2) Write a program that prints three arguments taken from the
// command line. To do this, you’ll need to index into the command-line array of Strings.
package ru.kulichenkom;

public class CommandLine {


           public static void main(String[] args) {
                       System.out.println("Всего аргументов в командной строке: "+args.length);
            for (int i = 0; i<=2; i++)
                   System.out.println(args[i]);

        }
    }

