package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*	
 	Dado as notas R$ 100,00 - R$ 50,00 - R$ 20,00 - R$ 10,00 - R$ 5,00 - R$ 2,00 e R$ 1,00.
	E as moedas R$ 0,50 - R$ 0,25 - R$ 0,10 - R$ 0,05 e R$ 0,01.
	Apresente o menor número de notas e moedas possivel, 
	Sem mostar quantas notas foram usadas de cada nota/moeda
	
*/

public class ex2 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat();
		
		double valorProduto;
		double valorPago;
		double valorTroco;
		int numeroDeNotas = 0;
		int numeroDeMoedas = 0;
		int aux = 0;
		int aux2 = 0;
		boolean multiplicou = false;

		System.out.println("Diga o valor do produto");
		valorProduto = kb.nextDouble();

		System.out.println("Diga o valor pago no produto");
		valorPago = kb.nextDouble();

		valorTroco = valorPago - valorProduto;

		while (valorTroco > 0) {
			if (valorTroco >= 100) {
				aux += (valorTroco / 100);
				valorTroco -= (aux * 100);
				numeroDeNotas += aux;
				aux = 0;
			}
			if (valorTroco >= 50) {

				aux += (valorTroco / 50);
				valorTroco -= (aux * 50);
				numeroDeNotas += aux;
				aux = 0;

			}
			if (valorTroco >= 20) {

				aux += (valorTroco / 20);
				valorTroco -= (aux * 20);
				numeroDeNotas += aux;
				aux = 0;

			}
			if (valorTroco >= 10) {

				aux += (valorTroco / 10);
				valorTroco -= (aux * 10);
				numeroDeNotas += aux;
				aux = 0;

			}
			if (valorTroco >= 5) {

				aux += (valorTroco / 5);
				valorTroco -= (aux * 5);
				numeroDeNotas += aux;
				aux = 0;

			}
			if (valorTroco >= 2) {

				aux += (valorTroco / 2);
				valorTroco -= (aux * 2);
				numeroDeNotas += aux;
				aux = 0;

			}
			if (valorTroco == 1) {

				aux += (valorTroco / 1);
				valorTroco -= (aux * 1);
				numeroDeNotas += aux;
				aux = 0;

			}
			while (valorTroco > 0) {
				
				if (!multiplicou) {
					String trocoArredondado = df.format(valorTroco);
					trocoArredondado = trocoArredondado.replaceAll( "," , "." );
					valorTroco = Double.parseDouble(trocoArredondado);
					valorTroco *= 100;
					trocoArredondado = df.format(valorTroco);
					trocoArredondado = trocoArredondado.replaceAll( "," , "." );
					valorTroco = Double.parseDouble(trocoArredondado);
					multiplicou = true;
				}
				
				
				if (valorTroco >= 50) {
					aux += (valorTroco / 50);
					valorTroco -= (aux * 50);
					numeroDeMoedas += aux;
					aux = 0;
				}
				if (valorTroco >= 25) {

					aux += (valorTroco / 25);
					valorTroco -= (aux * 25);
					numeroDeMoedas += aux;
					aux = 0;
				}
				if (valorTroco >= 10) {

					aux += (valorTroco / 10);
					valorTroco -= (aux * 10);
					numeroDeMoedas += aux;
					aux = 0;
				}
				if (valorTroco >= 5) {

					aux += (valorTroco / 5);
					valorTroco -= (aux * 5);
					numeroDeMoedas += aux;
					aux = 0;
				}
				if (valorTroco >= 1) {

					aux += (valorTroco / 1);
					valorTroco -= (aux * 1);
					numeroDeMoedas += aux;
					aux = 0;
				}
				
			}
			
			
		}

		System.out.println("");
		System.out.println("Número de notas: " + numeroDeNotas);
		System.out.println("");
		System.out.println("Número de moedas: " + numeroDeMoedas);

	}
}
