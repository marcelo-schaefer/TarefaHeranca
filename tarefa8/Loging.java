package br.com.tarefa8;

import java.lang.invoke.SwitchPoint;
import java.text.Normalizer;
import java.util.ArrayList;

public class Loging {

	private String email;
	private String senha;

	public String setEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void criarEmail(String email) {
		System.out.println("seu email é:" + email);
	}

	public void regrasSenha() {
		System.out.println("a senha deve ser entre 8 a 16 caracteries e conter no minimo duas destas condicoes:");
		System.out.println();
		System.out.println("numero, caracter especial ou letra maiuscula");
		System.out.println();
		System.out.println("digite sua senha:");
	}

	public void criarSenha(String senha) {
		senha.trim();
		Loging loging = new Loging();
		int i = 1;

		if (senha.length() >= 8 && senha.length() < 16) {

			while (true) {

				switch (i) {

				case 1:

					if (!senha.equals(senha.toLowerCase()) && loging.numero(senha) == true) {
						System.out.println("sua senha: " + senha);
						System.out.println("sua senha foi salva!");
						System.exit(0);
					}
					i++;
					break;

				case 2:
					if (!senha.equals(senha.toLowerCase()) && !senha.equals(loging.simbulo(senha))) {
						System.out.println("sua senha: " + senha);
						System.out.println("sua senha foi salva!");
						System.exit(0);
					}
					i++;
					break;

				case 3:
					if (loging.numero(senha) == true && !senha.equals(loging.simbulo(senha))) {
						System.out.println("sua senha: " + senha);
						System.out.println("sua senha foi salva!");
						System.exit(0);
					}
					i++;
					break;

				case 4:
					System.out.println("sua senha nao apresentou duas das condicoes");
					System.exit(0);
					break;
				}
			}

		} else {
			System.out.println("a senha deve ter entre 8 a 16 caracteries");
		}
	}

	private Boolean numero(String senha) {
		String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		Boolean tem = false;
		for (int i = 0; i < numeros.length; i++) {
			if (senha.contains(numeros[i])) {
				tem = true;
			}
		}
		return tem;
	}

	private String simbulo(String senha) {
		senha = senha.replaceAll("['\"]", "");
		senha = senha.replaceAll("[<>()\\{\\}]", "");
		senha = senha.replaceAll("['\\\\.,()|/]", "");
		senha = senha.replaceAll("[^!-ÿ]{1}[^ -ÿ]{0,}[^!-ÿ]{1}|[^!-ÿ]{1}", " ");
		return senha;
	}
}
