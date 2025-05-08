package exe002;

import java.util.Scanner;

//Par ou Ímpar: Crie um programa que receba um número inteiro
//e determine se ele é par ou ímpar. Imprima a mensagem correspondente.

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro:");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.printf("O número %d é par.", num);
		}
		else {
			System.out.printf("O número %d é ímpar.", num);
		}
		
		sc.close();
	}

}
