package poo;

import poo.dao.PessoaDAO;
import poo.model.Pessoa;

public class Main {

	public static void main(String[] args) {

		PessoaDAO dao = new PessoaDAO();

		Pessoa p1 = dao.getPessoaById(new Long(1)); // new Pessoa("Jota", "jota@email.com");
		Pessoa p2 = dao.getPessoaById(new Long(2)); // new Pessoa("Peu", "peu@email.com");

		// dao.cadastrarPessoa(p1);
		// dao.cadastrarPessoa(p2);

		System.out.println(p1);
		System.out.println(p2);

	}

}
