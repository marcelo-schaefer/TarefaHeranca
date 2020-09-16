package tarefaHeranca;

public class ImovelNovo extends Imovel {

	private Integer precoAdicional;

	public Integer getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(Integer precoAdicional) {
		this.precoAdicional = precoAdicional;
	}

	@Override
	public void precoFinal() {

		this.setPreco(50000);
		this.setPrecoAdicional(5000);
		int total = 0;
		total = this.getPreco() + this.getPrecoAdicional();
		System.out.println(total);
	}
}
