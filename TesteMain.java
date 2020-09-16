package tarefaHeranca;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class TesteMain {
	public static void main(String[] args) {
		Administrativo administrativo = new Administrativo();
		Tecnico tecnico = new Tecnico();

		// letra A

		administrativo.setNome("carlos");
		administrativo.setId(7301);

		administrativo.nomes();
		administrativo.ids();

		tecnico.setNome("paulo");
		tecnico.setId(9281);

		tecnico.nomes();
		tecnico.ids();

		// letra B

		Normal normal = new Normal();
		CamaroteSuperior superior = new CamaroteSuperior();
		CamaroteInferior inferior = new CamaroteInferior();

		System.out.println("1 - ingresso normal (30 reais)");
		System.out.println("2 - ingresso vip (adcional de 20 reais)");

		Scanner scanner = new Scanner(System.in);
		String pergunta = scanner.nextLine();

		if (pergunta.equals("1")) {
			System.out.println("ingresso normal");
			normal.imprimeValor();
		} else if (pergunta.equals("2")) {
			System.out.println("1 - superior (adicional de 10 reais)");
			System.out.println("2 - inferior");
			String pergunta2 = scanner.nextLine();

			if (pergunta2.equals("1")) {
				superior.valorExtra();
			} else if (pergunta2.equals("2")) {
				inferior.valorExtra();
			}

		}

		// letra C

		ImovelNovo novo = new ImovelNovo();
		ImovelVelho velho = new ImovelVelho();

		System.out.println("1 - imovel novo");
		System.out.println("2 - imovel velho");

		String opcao = scanner.nextLine();

		if (opcao.equals("1")) {
			novo.precoFinal();
		} else {
			velho.precoFinal();
		}

	}
}
