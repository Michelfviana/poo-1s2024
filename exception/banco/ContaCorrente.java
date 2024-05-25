package exception.banco;

public class ContaCorrente {

	private String nomeConta;
	private Double saldo;

	private ContaCorrente() {
	}

	public ContaCorrente(String nomeConta) {
		this.nomeConta = nomeConta;
		this.saldo = 0.0;
	}

	public String getNomeConta() {
		return this.nomeConta;
	}

	public void setNomeConta(String nomeConta) {
		this.nomeConta = nomeConta;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

}
