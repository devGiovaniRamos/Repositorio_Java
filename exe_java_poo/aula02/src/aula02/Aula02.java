package aula02;

public class Aula02 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Fina";
		c1.cor = "Azul";
		c1.ponta = 0.5f;
		c1.carga = 50;
		c1.tampar();
		c1.rabiscar();
		c1.status();
	}

}
