package inputs_e_saidas;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		String a1, a2, a3;
		
		a = sc.nextInt();
		sc.nextLine();
		a1 = sc.nextLine();
		a2 = sc.nextLine();
		a3 = sc.nextLine();
		
		System.out.println("DADOS CADASTRADOS:");
		System.out.println(a);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}

}
