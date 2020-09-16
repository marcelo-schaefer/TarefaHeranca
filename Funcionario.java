package tarefaHeranca;

public class Funcionario {

	private String nome;
	private Integer salario;
	private Integer id;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void trabalhando() {
		System.out.println("trabalhando!");
	}

	public void nomes() {
		System.out.println("nome: " + this.getNome());
	}

	public void ids() {
		System.out.println("id: " + this.getId());
	}

}