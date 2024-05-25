package exception.banco.exceptions;

public class ContaInexistenteException extends Exception {
	public ContaInexistenteException() {
		super("Conta inexistente.");
	}
}
