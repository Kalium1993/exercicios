package exercicios;

import java.util.Scanner;
/*
	
	imprimir array por intervalos sequênciais, separadamente
	
 */
public class ex3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[] array = { 100, 101, 102, 103, 104, 105, 110, 111, 112, 113, 115, 118, 119, 120 };

		for (int i = 0; i <= array.length; i++) {
			if (array[i] - array[i+1] == -1) {
				System.out.println(array[i]);
			}
		}
	}
}
