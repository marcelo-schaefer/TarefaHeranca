package tarefaHeranca;

public class Divisao implements OperacaoMatematica {

	@Override
	public int calcular(int n1, int n2) {
		return n1 / n2;
	}

	@Override
	public void imprimir() {
		System.out.println(calcular(1, 2));
	}

}
