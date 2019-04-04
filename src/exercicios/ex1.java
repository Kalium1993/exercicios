package exercicios;

import java.util.Scanner;

/*
 	Descubra se um ano � bissexto!
 	L�gica: anos bissextos s�o divis�veis por 4, mas n�o por 100, e tamb�m s�o divis�veis por 400
 	Extra: acrescentar um loop para testar v�rios anos.
 
 */

public class ex1 {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int ano;
		String resposta = "S";
		
		
		System.out.println("Saiba se um ano � bissexto:");
		while (resposta.equals("S")) {
			
			System.out.println("Informe o ano");
			ano = kb.nextInt();
			kb.nextLine();
			System.out.println("");
			
			if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0)
				System.out.println(ano + " � bissexto");
			else {
				System.out.println(ano + " n�o � bissexto");
			}
			
			System.out.println("");
			System.out.println("Deseja testar outro ano?");
			resposta = kb.nextLine();
			resposta = resposta.toUpperCase().trim();
			System.out.println("");
		}
		
		
	}
}
