//насколько я понял отличие конкретной фабрики от абстрактной такое:
//Абстракнтая фабирка генерирует фабрики, которые уже в свою очередь генерируют продукты.
//Конкретная фабрика сразу генерирует продукты. В моем случае, если создать в абстрактной фабрике
// метод play(), и от него имплементировать фабрики: "подвижные игры", "настольные игры". Эти
//фабрики уже будут генерироваться в зависимости от дальнейшего кода.
package ru.kulichenkom.ekkel.chapter9.game.GameWithAbstractFactory;

public interface AbstractGameFactory {
    Game getGame();
}
