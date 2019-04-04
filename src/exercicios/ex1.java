package exercicios;

import java.util.Scanner;

/*
 	Descubra se um ano é bissexto!
 	Lógica: anos bissextos são divisíveis por 4, mas não por 100, e também são divisíveis por 400
 	Extra: acrescentar um loop para testar vários anos.
 
 */

public class ex1 {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int ano;
		String resposta = "S";
		
		
		System.out.println("Saiba se um ano é bissexto:");
		while (resposta.equals("S")) {
			
			System.out.println("Informe o ano");
			ano = kb.nextInt();
			kb.nextLine();
			System.out.println("");
			
			if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
				System.out.println(ano + " é bissexto");
			else {
				System.out.println(ano + " não é bissexto");
			}
			
			System.out.println("");
			System.out.println("Deseja testar outro ano?");
			resposta = kb.nextLine();
			resposta = resposta.toUpperCase().trim();
			System.out.println("");
		}
		
		
	}
}
