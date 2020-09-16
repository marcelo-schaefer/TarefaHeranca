package tarefaHeranca;

public class Vip extends Ingresso {

	private Integer valorAdicional;
	private String localizacao;

	public Integer getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Integer valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void valorExtra() {

		this.setValorAdicional(20);
		int total = 0;
		total = this.getValor() + this.getValorAdicional();
		System.out.println(total + " reais");
	}

}
