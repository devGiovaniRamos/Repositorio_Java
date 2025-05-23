package cauculadora_com_switch_case;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número 1:");
		double num1 = sc.nextDouble();
		System.out.println("Número 2:");
		double num2 = sc.nextDouble();
		System.out.println("Operador: |+|-|x|/|");
		String operador = sc.next();
		
		double resultado = 0;
		switch (operador) {
		case "+":
			resultado = num1 + num2;
			break;
		case "-":
			resultado = num1 - num2;
			break;
		case "x":
			resultado = num1 * num2;
			break;
		case "/":
			resultado = num1 / num2;
			break;
		default:
			System.out.println("Operador inválido.");
			
		
		}
		
		System.out.println(resultado);
		
		sc.close();

	}

}
