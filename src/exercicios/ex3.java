package exercicios;

import java.util.Scanner;
/*
	
	Imprimir um array por intervalos sequenciais, separadamente.
	Por exemplo:
	Dado o array: { 100, 101, 102, 103, 104, 105, 110, 111, 112, 113, 115, 118, 119, 120, 125 }.
	A impressão deverá ser os intervalos de: [100 - 105], [110 - 113], [115], [118 - 120], [125]. 
	
 */
public class ex3 {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		int[] array = { 100, 101, 102, 103, 104, 105, 110, 111, 112, 113, 115, 118, 119, 120, 125 };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			if (i < array.length-1) {
				if (array[i] - array[i+1] == -1) {
					continue;
				}
				System.out.println("---"); //Este System.out serve apenas para separar os intervalos.
			}
			
		}
		
	}
	
}
