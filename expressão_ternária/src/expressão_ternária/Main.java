package expressão_ternária;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Preço total da compra:");
		double preco = sc.nextDouble();
	    double desconto = (preco > 29) ? preco * 0.1 : preco * 0.05;
	    System.out.printf("O total a paga é de R$%.2f", preco - desconto);
		
		sc.close();
	}

}
