package sintaxe_basica;
import java.util.Scanner;

public class A_MediaAritmetica {
	public static void main(String[]args) {
		Scanner numero = new Scanner(System.in);
		double numero1, numero2, resultado_media_aritmedica;
		System.out.println("Digite dois numeros para obter a media aritmedica:\n");
		numero1 = numero.nextDouble();
		numero2 = numero.nextDouble();
		resultado_media_aritmedica = (numero1 + numero2) / 2;
		System.out.println("O resultado da media aritmedica e: \n" + resultado_media_aritmedica);
		numero.close();
	}
}
