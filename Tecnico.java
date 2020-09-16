package tarefaHeranca;

public class Tecnico extends Funcionario {

	private Integer bonosSAlario;

	public Integer getBonosSAlario() {
		return bonosSAlario;
	}

	public void setBonosSAlario(Integer bonosSAlario) {
		this.bonosSAlario = bonosSAlario;
	}

	@Override
	public void trabalhando() {
		System.out.println("trabalhando como tecnico!");
	}
}
