package exe001;

import java.util.Locale;
import java.util.Scanner;

public class exe {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura, altura, preco, mQuadrado, custo;
		
		System.out.println("Digite a largura do terreno:");
		largura = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite a altura do terreno:");
		altura = sc.nextDouble();
		sc.nextLine();
		System.out.println("Digite o preço do metro quadrado:");
		preco = sc.nextDouble();
		sc.nextLine();
		
		mQuadrado = largura * altura;
		custo = preco * mQuadrado;
		
		System.out.printf("O terreno tem %.2f metros quadrados e custará R$%.2f.", mQuadrado, custo);
		
		sc.close();

	}

}
