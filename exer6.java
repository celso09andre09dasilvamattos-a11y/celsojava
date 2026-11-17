import java.util.Scanner;

public class exer6 {
	public static void main(String[] args) {
		String nome;
		int idade;
		boolean conta;
		Scanner entrada = new Scanner(System.in);
		System.out.print("informe o nome de usuário:");
		nome = entrada.next();
		System.out.print("informe idade em anos:");
		idade = entrada.nextInt();
		System.out.print("informa se sua conta está ativa, digite true se estiver ativa ou false se estiver inativa:");
		conta = entrada.nextBoolean();
		System.out.println("nome de usuário:" + nome);
		System.out.println("idade:" + idade);
		System.out.println("está ativa?:" + conta);
	}
}