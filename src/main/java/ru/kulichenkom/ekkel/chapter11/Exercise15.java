//Ch11Ex15 Используя реализацию net.mindview.util.Stack, вычислите результат следующего
// выражения, в котором "+" означает занести следующую букву в стек, а "-" - извлечь
//верхний элемент стека и вывести его:
// +U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---
package ru.kulichenkom.ekkel.chapter11;

import ru.kulichenkom.utils.Stack;

public class Exercise15 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        stack.push('U');
        stack.push('n');
        stack.push('c');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push('e');
        stack.push('r');
        stack.push('t');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push('a');
        System.out.print(stack.pop());
        stack.push('i');
        System.out.print(stack.pop());
        stack.push('n');
        stack.push('t');
        stack.push('y');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push(' ');
        System.out.print(stack.pop());
        stack.push('r');
        stack.push('u');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        stack.push('l');
        stack.push('e');
        stack.push('s');
        System.out.print(stack.pop());
        System.out.print(stack.pop());
        System.out.print(stack.pop());
    }
}
