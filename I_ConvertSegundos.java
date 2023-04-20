package sintaxe_basica;
import java.util.Scanner;
public class I_ConvertSegundos {
	public static void main(String[]args){
		Scanner scannervalores = new Scanner(System.in);
		int numeroemsegundos, numeroemminutos, numeroemhoras;
		System.out.println("Digite em segundos o que deseja saber a quantidade correspondente em horas e minutos:\n");
		numeroemsegundos = scannervalores.nextInt();
		numeroemminutos = numeroemsegundos /60;
		numeroemhoras = numeroemsegundos /3600;
		System.out.printf("O valor em segundos e: %d segundos.\nO valor em minutos e: %d minutos.\n"
				+ "O valor em horas e: %d horas.\n", numeroemsegundos, numeroemminutos, numeroemhoras);
		scannervalores.close();
	}
}
