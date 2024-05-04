// Apresentar o total da soma obtida dos cem primeiros números inteiros (1+2+3+4+...+98+99+100).

package tarefa10;

public class EX03 {

	public static void main(String[] args) {
		int soma = 0;
		int contador = 1;

		while (contador < 101) {
			soma = soma + contador;
			contador++;
		}
		
		System.out.println(soma);

	}

}
