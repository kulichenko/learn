//Как правило, генератор (разновидность паттерна проектирования "Фабричный метод") определяет всего один метод.
//Мы назовем его как next() и включим в стандартный инструментарий:
package ru.kulichenkom.ekkel.chapter15.coffee;

public interface Generator<T> {
    T next();
}
//Возращаемый тип next() параметризуется по Т.