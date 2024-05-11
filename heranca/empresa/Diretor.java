package heranca.empresa;

public class Diretor extends Funcionario {

	private Integer quantidadeGerencias;

	private Diretor() {
	}

	public Diretor(String nome, Integer cpf, Integer telefone, Double salario, Integer quantidadeGerencias) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.salario = salario;
		this.quantidadeGerencias = quantidadeGerencias;
	}

	public Integer getQuantidadeGerencias() {
		return this.quantidadeGerencias;
	}

	public void setQuantidadeGerencias(Integer quantidadeGerencias) {
		this.quantidadeGerencias = quantidadeGerencias;
	}

	public Double getBonificacao() {
		return this.salario * 0.35;
	}

	@Override
	public String toString() {
		return "{" +
				" nome='" + getNome() + "'" +
				", cpf='" + getCpf() + "'" +
				", telefone='" + getTelefone() + "'" +
				", salario='" + getSalario() + "'" +
				", quantidadeGerencias='" + getQuantidadeGerencias() + "'" +
				", bonificacao='" + getBonificacao() + "'" +
				"}";
	}

}
