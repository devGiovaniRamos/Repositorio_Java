package criando_ola_mundo;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá Mundo!");
		int y = 24;
		double x = 10.53281;
		System.out.printf("%.2f%n",x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n",x);
		System.out.println(y);
		System.out.println("RESULTADO = "+ x +" METROS.");
		System.out.printf("RESULTADO = %.2f METROS.%n",x);
		String nome = "Giovani";
		double salario = 2000.0;
		int idade = 24;
		System.out.printf("%s tem %d anos e recebe um salário de R$%.2f", nome, idade, salario);
	}

}
