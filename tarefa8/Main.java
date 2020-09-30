package br.com.tarefa8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Loging loging = new Loging();
		
		System.out.println("digite seu email: ");
		String email = scanner.nextLine();
		
		loging.criarEmail(email);
		
		loging.regrasSenha();
		String senha = scanner.nextLine();
		
		loging.criarSenha(senha);
	}

}
