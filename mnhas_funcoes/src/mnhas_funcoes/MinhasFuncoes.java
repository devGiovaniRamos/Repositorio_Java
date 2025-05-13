package mnhas_funcoes;

public class MinhasFuncoes {

	public static void main(String[] args) {
		
		int a = 2;
		int b = 6;
		int c = 11;
		
		int maximo = max(a, b, c);
		
		System.out.println(maximo);

	}
	
	public static int max(int a, int b, int c) {
		int aux;
		if (a> b && a > c) {
			aux = a;
		}
		else if (b > c) {
			aux = b;
		}
		else {
			aux = c;
		}
		return aux;
	}

}
