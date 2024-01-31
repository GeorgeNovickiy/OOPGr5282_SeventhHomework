public class App {
    public static void main(String[] args) {
        // Создаем объекты комплексных чисел
        ComplexNumber a = new BasicComplexNumber(2, 3);
        ComplexNumber b = new BasicComplexNumber(1, 4);

        // Создаем калькулятор
        ComplexCalculator calculator = new ComplexCalculator();

        // Применяем декоратор логирования к числам
        ComplexNumberDecorator decoratedA = new LoggingComplexNumberDecorator(a);
        ComplexNumberDecorator decoratedB = new LoggingComplexNumberDecorator(b);

        // Выполняем операции с декорированными числами
        ComplexNumber resultAddition = calculator.add(decoratedA, decoratedB);
        ComplexNumber resultMultiplication = calculator.multiply(decoratedA, decoratedB);
        ComplexNumber resultDivision = calculator.divide(decoratedA, decoratedB);

        // Выводим результаты в консоль
        System.out.println("Результат сложения комплексных чисел: " + resultAddition.getReal() + " + " +
                           resultAddition.getImaginary() + "i");
        System.out.println("Результат умножения комплексных чисел: " + resultMultiplication.getReal() + " + " +
                           resultMultiplication.getImaginary() + "i");
        System.out.println("Результат деления комплексных чисел: " + resultDivision.getReal() + " + " +
                           resultDivision.getImaginary() + "i");
    }
}