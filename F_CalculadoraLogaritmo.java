package sintaxe_basica;
import java.util.Scanner;
public class F_CalculadoraLogaritmo {
	public static void main(String[]args) {
		double logaritmando, base;
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o logaritmando e depois a sua base:");
		logaritmando = scan.nextDouble();
		base = scan.nextDouble();
		System.out.printf("O resultado é: %.4f\n", Math.log(base)/ Math.log(logaritmando));
		scan.close();
	}
}
