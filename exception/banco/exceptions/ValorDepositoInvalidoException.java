package exception.banco.exceptions;

public class ValorDepositoInvalidoException extends Exception {

	public ValorDepositoInvalidoException() {
		super("Valor do depótiso inválido. Informe um número positivo.");
	}

}
