package estrutura_while;

public class Main {

	public static void main(String[] args) {
		
		double x = 5.0;
		double y = 0;
		
		while (x != -1) {
			System.out.printf("x = %.1f |y = %.1f |", x, y); 
			x += -1;
			y += 1;
			
		}

	}

}
