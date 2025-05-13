package do_while;

import java.util.Scanner;

public class exe_do_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char resposta;
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double c = sc.nextDouble();
			double f = 9 * c / 5 + 32;
			System.out.printf("Equivalente a Fahrenheit: %.1f%n", f);
			System.out.print("Deseja continuar ? [s/n]: ");
			resposta = sc.next().charAt(0);
		} while (resposta != 'n');
		
		System.out.println("Programa finalizado.");
		sc.close();

	}

}
