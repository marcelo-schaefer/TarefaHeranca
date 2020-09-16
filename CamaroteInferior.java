package tarefaHeranca;

public class CamaroteInferior extends Vip {

	@Override
	public void valorExtra() {

		this.setValor(30);
		this.setValorAdicional(20);
		this.setLocalizacao("inferior");
		int total = 0;
		total = this.getValor() + this.getValorAdicional();
		System.out.println(total + " reais " + this.getLocalizacao());

	}
}
