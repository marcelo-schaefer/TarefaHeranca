package tarefaHeranca;

public class Administrativo extends Funcionario {

	private Integer turnoAdicional;

	public Integer getTurnoAdicional() {
		return turnoAdicional;
	}

	public void setTurnoAdicional(Integer turnoAdicional) {
		this.turnoAdicional = turnoAdicional;
	}

	@Override
	public void trabalhando() {
		System.out.println("trabalhando como administrador!");
	}
}
