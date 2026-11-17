import java.util.Scanner;

public class exer5 {
	public static void main(String[] args) {
		int anos, dias;
		Scanner entrada = new Scanner(System.in);
		System.out.print("informe idade em anos:");
		anos = entrada.nextInt();
		dias = anos * 365;
		System.out.print("idade em dias:" + dias);
	}
}