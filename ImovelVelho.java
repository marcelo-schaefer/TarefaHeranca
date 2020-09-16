package tarefaHeranca;

public class ImovelVelho extends Imovel {

	private Integer precoDesconto;

	public Integer getPrecoDesconto() {
		return precoDesconto;
	}

	public void setPrecoDesconto(Integer precoDesconto) {
		this.precoDesconto = precoDesconto;
	}

	@Override
	public void precoFinal() {

		this.setPreco(50000);
		this.setPrecoDesconto(5000);
		int total = 0;
		total = this.getPreco() - this.getPrecoDesconto();
		System.out.println(total);
	}
}
