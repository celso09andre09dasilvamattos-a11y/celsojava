import java.util.Scanner;

public class SuceAnte{
	public static void main(String[] args) {
		int numero, antecessor, sucessor;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		numero = entrada.nextInt();
		antecessor = numero - 1;
		sucessor = numero + 1;
		System.out.println("numero:" + numero);
		System.out.println("seu antecessor:" + antecessor);
		System.out.println(" seu sucessor:" + sucessor);
	}
}