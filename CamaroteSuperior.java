package tarefaHeranca;

public class CamaroteSuperior extends Vip {

	@Override
	public void valorExtra() {

		this.setValorAdicional(30);
		this.setValor(30);
		this.setLocalizacao("superior");
		int total = 0;
		total = this.getValor() + this.getValorAdicional();
		System.out.println(total + " reais " + this.getLocalizacao());
	}
}
