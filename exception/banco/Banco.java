package exception.banco;

import java.util.ArrayList;

import exception.banco.exceptions.ContaInexistenteException;
import exception.banco.exceptions.ValorDepositoInvalidoException;

public class Banco {

	private ArrayList<ContaCorrente> contas;

	public Banco() {
		this.contas = new ArrayList<>();
	}

	public void abrirConta(String nomeConta) {
		ContaCorrente conta = new ContaCorrente(nomeConta);
		this.contas.add(conta);
	}

	public void depositar(String nomeConta, Double valorDeposito) throws Exception {

		if (valorDeposito <= 0) {
			throw new ValorDepositoInvalidoException();
		}

		ContaCorrente contaDeposito = null;
		for (ContaCorrente conta : contas) {
			if (conta.getNomeConta().equals(nomeConta)) {
				contaDeposito = conta;
				conta.setSaldo(conta.getSaldo() + valorDeposito);
			}
		}

		if (contaDeposito == null) {
			throw new ContaInexistenteException();
		}

	}

}
