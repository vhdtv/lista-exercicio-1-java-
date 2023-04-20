package sintaxe_basica;
import java.util.Scanner;
				
public class E_CalculadoradeSalarioBruto {
	public static void main(String[]args) {
		Scanner scannervalores = new Scanner(System.in);
		double salariobruto, numerodehorastrabalhas, valorporhora, valorsalariofamilia;
		int numerodefilhos;
		System.out.println("Digite nessa respectiva ordem numero de horas trabalhas, valor recebido por hora de trabalho, valor do salario familia,"
				+ " numero de filhos menores que 14 anos.\n");
		numerodehorastrabalhas = scannervalores.nextDouble();
		valorporhora = scannervalores.nextDouble();
		valorsalariofamilia = scannervalores.nextDouble();
		numerodefilhos = scannervalores.nextInt();
		salariobruto = (numerodehorastrabalhas * valorporhora) + (valorsalariofamilia * numerodefilhos);
		System.out.println("O valor do salario bruto do funcionario e: \n" + salariobruto);
		scannervalores.close();
	}
}
