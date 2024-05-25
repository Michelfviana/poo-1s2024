package exception;

import exception.banco.Banco;
import exception.banco.exceptions.ContaInexistenteException;
import exception.banco.exceptions.ValorDepositoInvalidoException;

public class Main {

	public static void main(String[] args) {

		Banco UCBank = new Banco();

		UCBank.abrirConta("conta 1");

		try {
			UCBank.depositar("conta 2", -10.0);
		} catch (ContaInexistenteException e) {
			System.out.println(e);
		} catch (ValorDepositoInvalidoException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println("Algo deu errado. Tente novamente.");
		}

	}

}
