// Базовая реализация комплексного числа
public class BasicComplexNumber implements ComplexNumber {
    private double real;
    private double imaginary;

    // Конструктор, принимающий вещественную и мнимую части
    public BasicComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public double getReal() {
        return real;
    }

    @Override
    public double getImaginary() {
        return imaginary;
    }
}