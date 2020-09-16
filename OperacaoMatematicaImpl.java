package tarefaHeranca;

public class OperacaoMatematicaImpl {

	public void calculadora() {

		OperacaoMatematica operacao = new OperacaoMatematica() {

			@Override
			public int calcular(int n1, int n2) {
				return n1 * n2;
			}

			@Override
			public void imprimir() {
				System.out.println(calcular(1, 2));

			}
		};
	}

	public static void main(String[] args) {

		Soma soma = new Soma();
		Multiplicacao multiplicacao = new Multiplicacao();

		System.out.println(soma.calcular(3, 7));
		System.out.println(multiplicacao.calcular(4, 10));
	}

}
