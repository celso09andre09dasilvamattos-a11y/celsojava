import java.util.Scanner;

public class exer2 {
	public static void main(String[] args) {
		int num1, num2, soma, sub, multi, div;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o primeiro valor: ");
		num1 = entrada.nextInt();
		System.out.print("Informe o segundo valor: ");
		num2 = entrada.nextInt();
		soma = num1 + num2;
		sub = num1 - num2;
		multi = num1 * num2;
		div = num1 / num2;
		System.out.println ("soma: " + soma);
		System.out.println ("subtração: " + sub);
		System.out.println ("multiplicação: " + multi);
		System.out.println ("divisão: " + div);
	}
}