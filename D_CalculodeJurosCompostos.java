package sintaxe_basica;
import java.util.Scanner;
public class D_CalculodeJurosCompostos {
	public static void main(String[]args){
		Scanner scannervalores = new Scanner(System.in);
		double montante, capital, taxadejuros, taxadejurosconvertida;
		int prazodaaplicacao;
		System.out.println("Digite os valores nessa respectiva ordem Capital aplicado, taxa de juros e prazo da aplicacao em meses:\n");
		capital = scannervalores.nextDouble();
		taxadejuros = scannervalores.nextDouble();
		prazodaaplicacao = scannervalores.nextInt();
		taxadejurosconvertida = taxadejuros / 100;
		montante = capital * Math.pow(1 + taxadejurosconvertida , prazodaaplicacao);
		System.out.printf("O valor do montante final da aplicacao financeira e: %.2f\n", montante);
		scannervalores.close();
	}
}
