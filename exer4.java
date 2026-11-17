import java.util.Scanner;

public class exer4 {
	public static void main(String[] args) {
		double metros, cent;
		Scanner entrada = new Scanner(System.in);
		System.out.print("informe a medida em metros:");
		metros = entrada.nextDouble();
		cent = metros * 100;
		System.out.print("medida em centímetros:" + cent);
	}
}