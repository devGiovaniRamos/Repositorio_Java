package adivinhe_o_numero;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();
		int num_aleatorio = random.nextInt(100) + 1;
		
		System.out.print("Tente adivinhar o número que gerei de 1 a 100: ");
		int usuario;
		
		
		do {usuario = sc.nextInt();
			if (usuario == num_aleatorio) {
				System.out.println("Parabéns, voce acertou!");
				break;
			}
			else if (usuario > num_aleatorio) {
				System.out.print("Alto! Tente novamente.");	
			}
			else if (usuario < num_aleatorio) {
				System.out.print("Baixo! Tente novamente.");
			}
		} while (usuario != num_aleatorio);
		
		
		sc.close();

	}

}
