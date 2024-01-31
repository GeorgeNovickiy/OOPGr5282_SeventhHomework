// Декоратор для логирования комплексных чисел
public class LoggingComplexNumberDecorator implements ComplexNumberDecorator {
    private ComplexNumber decoratedNumber;

    // Конструктор, принимающий объект комплексного числа для декорирования
    public LoggingComplexNumberDecorator(ComplexNumber decoratedNumber) {
        this.decoratedNumber = decoratedNumber;
    }

    @Override
    public double getReal() {
        log("Получение вещественной части числа");
        return decoratedNumber.getReal();
    }

    @Override
    public double getImaginary() {
        log("Получение мнимой части числа");
        return decoratedNumber.getImaginary();
    }

    // Приватный метод для логирования
    private void log(String message) {
        System.out.println(message);
    }
}