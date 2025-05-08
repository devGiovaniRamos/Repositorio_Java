package exe002;

import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] arg) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		
		
		if (idade <= 12) {
			System.out.println("Criança.");
		}
		else if (idade <= 17) {
			System.out.println("Adolescente.");
		}
		else {
			System.out.println("Adulto.");
		}
	}
}
