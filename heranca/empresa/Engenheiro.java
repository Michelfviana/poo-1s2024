package heranca.empresa;

public class Engenheiro extends Funcionario {

	private String crea;
	private String projeto;

	private Engenheiro() {
	}

	public Engenheiro(String nome, Integer cpf, Integer telefone,
			String crea, String projeto, Double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.crea = crea;
		this.projeto = projeto;
		this.salario = salario;
	}

	public String getNome() {
		return this.nome;
	}

	public String getCrea() {
		return this.crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

	public String getProjeto() {
		return this.projeto;
	}

	public void setProjeto(String projeto) {
		this.projeto = projeto;
	}

	public Double getBonificacao() {
		return this.salario * 0.15;
	}

	@Override
	public String toString() {
		return "{" +
				" nome='" + getNome() + "'" +
				", cpf='" + getCpf() + "'" +
				", telefone='" + getTelefone() + "'" +
				", crea='" + getCrea() + "'" +
				", projeto='" + getProjeto() + "'" +
				", salario='" + getSalario() + "'" +
				", bonificacao='" + getBonificacao() + "'" +
				"}";
	}

}
