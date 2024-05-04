/*Elaborar um programa que apresente como resultado o valor do fatorial
* dos valores ímpares situados na faixa numérica de 1 a 10.
*/

package tarefa10;

public class EX11 {

	public static void main(String[] args) {
		int totalFatorial = 0;
		int fatorial = 1;

		while (fatorial < 11) {
			if (fatorial % 2 != 0) {
				for (int fator = 1; fator <= fatorial; fator++) {
					totalFatorial = totalFatorial + fator;
				}
				System.out.print(totalFatorial + " ");
			}
			fatorial++;
		}

	}

}
