package tarefaHeranca;

public class Ingresso {

	private Integer valor;

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public void imprimeValor() {
		System.out.println(this.getValor() + " reais");
	}

}
