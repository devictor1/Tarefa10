// Apresentar os resultados de uma tabuada de multiplicar (de 1 até 10) de um número qualquer.


package tarefa10;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo! Coloque abaixo um número qualquer.");
		double numeroQualquer = sc.nextDouble();
		int multiplicador = 1;
		
		while (multiplicador < 11) {
			System.out.print(numeroQualquer * multiplicador + " ");
			multiplicador++;
		}
		
		sc.close();
	}

}
