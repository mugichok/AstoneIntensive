package src.Streams.FunctionalInterfaces;

import java.util.function.*;

public class FunctionalInterfacesExample {
    public static void main(String[] args) {

        // Predicate- проверяет условие
        Predicate<Integer> isEven = x -> x % 2 ==0;
        System.out.println("Чётное ли число? " + isEven.test(4));

        //Function - преобразование одного типа в другой
        Function<String, Integer> stringLength = String::length;
        System.out.println("Длина строки: " + stringLength.apply("wvwberb"));

        //Supplier - возвращает значение
        Supplier<Double> randomValue = Math::random;
        System.out.println("Случайно число: " + randomValue.get());

        //Consumer - принимает значение и выполняет с ним действие
        Consumer<String> printer = System.out::println;
        printer.accept("Вывод строки через consumer");

        //UnaryOperator - принимает и возвращает значение одного типа
        UnaryOperator<Integer> square = x -> x*x;
        System.out.println("Квадрат числа: " + square.apply(5));

        //BinaryOperator - принимает на вход два объекта одного типа, выполняет над ними бинарную операцию и возвращает результат того же типа
        BinaryOperator<Integer> binary = (x,y) -> x>>y;
        System.out.println("Бинарный сдвиг: " + binary.apply(10,5));

        // Существует два типа лямбда выражений: однострочные и блоки кода
        Predicate<Integer> isOddAndSimple = x->{
            if(x % 2 !=0){
                for(int i =2; i <= Math.sqrt(x); i++){
                    if(x%i == 0){
                        return false;
                        }
                }
                return true;
            }
            return false;
        };
        System.out.printf("Простое и четное число %d? "+ isOddAndSimple.test(49), 49 );
    }
}
