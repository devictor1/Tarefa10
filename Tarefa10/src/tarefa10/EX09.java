/*Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo.
 * A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ...,etc.
 * Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente,
 * para que seja formado o próximo valor da seqüência. Portanto começando com os números
 * 1, 1 o próximo termo é 1+1=2, o próximo é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
 */

package tarefa10;

public class EX09 {

	public static void main(String[] args) {
		int fibonacci = 1;
		int fib1 = 1;
		int fib2 = 0;
		int contador = 0;

		while (fibonacci >= 1 && contador < 15) {
			fibonacci = fib1 + fib2;
			System.out.print(fibonacci + " ");
			fib1 = fib2;
			fib2 = fibonacci;
			contador++;
		}
	}

}
