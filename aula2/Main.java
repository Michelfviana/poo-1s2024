package aula2;

public class Main {
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        calc.numA = 10.0;
        calc.numB = 2.0;
        
        System.out.println("Somar: " + calc.somar());
        System.out.println("Subtrair: " + calc.subtrair());
        System.out.println("multiplicar: " + calc.multiplicar());
        System.out.println("dividir: " + calc.dividir());
    }
}
