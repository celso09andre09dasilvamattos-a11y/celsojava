import java.util.Scanner;

public class exer3 {
	public static void main(String[] args) {
		double n1, n2, n3, media;
		Scanner entrada = new Scanner(System.in);
		System.out.print("informe a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.print("informe a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.print("informe a terceira nota: ");
		n3 = entrada.nextDouble();
		media = (n1 + n2 + n3)  / 3;
		System.out.println("média:" + media);
	}
}