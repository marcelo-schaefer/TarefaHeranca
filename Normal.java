package tarefaHeranca;

public class Normal extends Ingresso {

	@Override
	public void imprimeValor() {
		this.setValor(30);
		System.out.println(this.getValor() + " reais");
	}
}
