// Калькулятор комплексных чисел
public class ComplexCalculator {
    // Метод для сложения комплексных чисел
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        return new BasicComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    // Метод для умножения комплексных чисел
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double real = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginary = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();
        return new BasicComplexNumber(real, imaginary);
    }

    // Метод для деления комплексных чисел
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
        double real = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator;
        double imaginary = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator;
        return new BasicComplexNumber(real, imaginary);
    }
}