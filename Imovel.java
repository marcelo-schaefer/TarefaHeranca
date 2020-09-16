package tarefaHeranca;

public class Imovel {

	private String endereco;
	private Integer preco;

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getPreco() {
		return preco;
	}

	public void setPreco(Integer preco) {
		this.preco = preco;
	}

	public void precoFinal() {

		System.out.println(preco);
	}

}
