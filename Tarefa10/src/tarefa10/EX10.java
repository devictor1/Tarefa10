/*Elaborar um programa que apresente os valores de conversão de graus
 * Celsius em Fahrenheit, de 10 em 10 graus, iniciando a contagem em 
 * 10 graus Celsius e finalizando em 100 graus Celsius. O programa deve
 * apresentar os valores das duas temperaturas. A fórmula de conversão 
 * é F = (9*C+160)/5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
 */

package tarefa10;

public class EX10 {

	public static void main(String[] args) {
		float celsius = 10;
			
		
		while (celsius < 101) {
			float fahrenheit = ((9 * celsius + 160)/5);
			System.out.println("O valor em Fahrenheit é de " + fahrenheit + "°F quando o valor em Celsius é " + celsius + "°C");
						
			celsius = celsius + 10;
		}

	}

}
