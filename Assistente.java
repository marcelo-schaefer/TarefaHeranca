package tarefaHeranca;

public class Assistente extends Funcionario {

	private Integer numeroMatricula;

	public Integer getNumeroMatricula() {
		return numeroMatricula;
	}

	public void setNumeroMatricula(Integer numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public void trabalhando() {
		System.out.println("trabalhando como assistente!");
	}
}
