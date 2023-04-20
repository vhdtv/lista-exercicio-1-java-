package sintaxe_basica;
import java.util.Scanner;
public class C_ConversordeMedidadeTemperatura {
	public static void main(String[]args) {
		Scanner scannertemperatura = new Scanner(System.in);
		double temperaturaFahrenheit, temperaturaCentigrados;
		System.out.println("Digite a temperatura em graus Fahrenheit que deseja converter para graus Centrigrados:\n");
		temperaturaFahrenheit = scannertemperatura.nextDouble();
		temperaturaCentigrados = (temperaturaFahrenheit - 32) / 1.8;
		System.out.println("A temperatura em graus centigrados e: \n"+ temperaturaCentigrados);
		scannertemperatura.close();
	}
}
