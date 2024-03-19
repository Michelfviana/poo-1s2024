package atividade1;

public class Calculadora {
    
    Double numA;
    Double numB;

    Double somar (){
        return numA + numB;
    }

    Double subtrair (){
        return numA - numB;
    }

    Double multiplicar (){
        return numA * numB;
    }

    Double dividir (){
        return numA / numB;
    }

   Boolean verificarNumeroPrimo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
   }
}