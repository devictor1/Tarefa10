/*Elaborar um programa que apresente no final o somatório
 * dos valores pares existentes na faixa de 1 até 500.
 */

package tarefa10;

public class EX04 {

	public static void main(String[] args) {
		int soma = 0;
		int contador = 1;

		while (contador < 501) {
			if (contador % 2 == 0) {
				soma = soma + contador;
			}
			contador++;
		}
		
		System.out.println(soma);

	}

}
