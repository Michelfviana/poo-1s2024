package atividade1;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        calc.numA = (double) 2;
        calc.numB = (double) 3;
        
        System.out.println("Somar: " + calc.somar());
        System.out.println("Subtrair: " + calc.subtrair());
        System.out.println("multiplicar: " + calc.multiplicar());
        System.out.println("dividir: " + calc.dividir());
        System.out.printf("Dividir: %.2f\n", calc.dividir());
        System.out.println("número primo:" + calc.verificarNumeroPrimo(0)); //false
        System.out.println("número primo:" + calc.verificarNumeroPrimo(1)); //false
        System.out.println("número primo:" + calc.verificarNumeroPrimo(2)); //true
        System.out.println("número primo:" + calc.verificarNumeroPrimo(3)); //true
        System.out.println("número primo:" + calc.verificarNumeroPrimo(7)); //true
        System.out.println("número primo:" + calc.verificarNumeroPrimo(83)); //true
        System.out.println("número primo:" + calc.verificarNumeroPrimo(100)); //false
        System.out.println("número primo:" + calc.verificarNumeroPrimo(991)); //true
        System.out.println("número primo:" + calc.verificarNumeroPrimo(104729)); //true
        System.out.println("número primo:" + calc.verificarNumeroPrimo(14348907)); //false
    }
}
