/* Elaborar um programa que apresente como resultado o valor de uma potência de uma base 
 * qualquer elevada a um expoente qualquer, ou seja, de BE, em que B é o valor da base e
 * E o valor do expoente. Observe que neste exercício não pode ser utilizado o operador
 * de exponenciação do portuguol (^).
 */
package tarefa10;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		double e;
		double b;
		System.out.println("Seja bem-vindo! Coloque abaixo uma base qualquer.");
		b = sc.nextDouble();
		System.out.println("Obrigado! Agora, coloque o expoente que será utilizado.");
		e = sc.nextDouble();
		System.out.print(Math.pow(b, e));
		sc.close();
	}

}
