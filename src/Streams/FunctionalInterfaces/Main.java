package src.Streams.FunctionalInterfaces;

/*
predicate<T> - проверяет соблюдение некоторого условия. Если оно соблюдается, возвращает true.
Consumer<T> - выполняет некоторое действие над объектом типа T, при этом ничего не возвращая.
Function<T, R> - представляет функцию перехода от объекта типа T к объекту типа R.
UnaryOperator<T> - Принимает в качестве параметра объект типа T, выполняет над ним действия и возвращает результат операции в виде объекта типа T.
BinaryOperator<T> - принимает в качестве параметра два объекта типа T, выполняет над ними бинарную операцию и возвращает её результат также в виде объекта типа T.

Лямбда представляет набор инструкций, которые можно выделить в отдельную переменную и затем многократно вызвать в различных местах программы
Лямбда выражение не выполняется само по себе. Вместо этого, оно используется для реализации метода, определенного в функциональном интерфейсе.

Под капотом лямбда выражение - анонимный класс или метод
 */

@FunctionalInterface
interface MathOperation {
    int operation(int a, int b);
}

public class Main {
    public static void main(String[] args) {
        // лямбда выражения для умножения и сложения
        MathOperation addition = (int a, int b) -> a + b;
        MathOperation multiplication = (int a, int b) -> a * b;

        System.out.println("Сложение" + addition.operation(5, 3));
        System.out.println("Умножение" + multiplication.operation(3,5));
    }

}
