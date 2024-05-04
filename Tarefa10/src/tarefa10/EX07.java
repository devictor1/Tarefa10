/* Apresentar os resultados das potências de 3, variando do expoente 0
 * até o expoente 15. Deve ser considerado que qualquer número elevado
 * a zero é 1, e elevado a 1 é ele próprio. Observe que neste exercício
 * não pode ser utilizado o operador de exponenciação do portuguol (^). 
 */
package tarefa10;

public class EX07 {

	public static void main(String[] args) {
		int expoente = 0;
		int num = 3;
		while (expoente < 16) {
			System.out.print(Math.pow(num, expoente) + " ");
			expoente++;
		}

	}

}
