package identificador_de_palindromo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite uma frase: ");
		String frase = sc.nextLine();
		
		frase = frase.replace(" ", "").toLowerCase();
		StringBuilder frase_rev = new StringBuilder(frase);
		String frase_invertida = frase_rev.reverse().toString();
		
		if (frase.equals(frase_invertida)) {
			System.out.println("Essa frase é um palíndromo.");
		}
		else {
			System.out.println("Essa frase não é um palíndromo.");
		}
		
		sc.close();
	}

}
